package com.ruoyi.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysYunshuCompany;
import com.ruoyi.system.service.ISysYunshuCompanyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 运输备案公司Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/yunshubeiancompany")
public class SysYunshuCompanyController extends BaseController
{
    @Autowired
    private ISysYunshuCompanyService sysYunshuCompanyService;

    /**
     * 查询运输备案公司列表
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysYunshuCompany sysYunshuCompany)
    {
        startPage();
        List<SysYunshuCompany> list = sysYunshuCompanyService.selectSysYunshuCompanyList(sysYunshuCompany);
        return getDataTable(list);
    }

    /**
     * 导出运输备案公司列表
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:export')")
    @Log(title = "运输备案公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysYunshuCompany sysYunshuCompany)
    {
        List<SysYunshuCompany> list = sysYunshuCompanyService.selectSysYunshuCompanyList(sysYunshuCompany);
        ExcelUtil<SysYunshuCompany> util = new ExcelUtil<SysYunshuCompany>(SysYunshuCompany.class);
        util.exportExcel(response, list, "运输备案公司数据");
    }

    /**
     * 获取运输备案公司详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:query')")
    @GetMapping(value = "/{companyName}")
    public AjaxResult getInfo(@PathVariable("companyName") String companyName)
    {
        return success(sysYunshuCompanyService.selectSysYunshuCompanyByCompanyName(companyName));
    }

    /**
     * 新增运输备案公司
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:add')")
    @Log(title = "运输备案公司", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysYunshuCompany sysYunshuCompany)
    {
        return toAjax(sysYunshuCompanyService.insertSysYunshuCompany(sysYunshuCompany));
    }

    /**
     * 修改运输备案公司
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:edit')")
    @Log(title = "运输备案公司", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysYunshuCompany sysYunshuCompany)
    {
        return toAjax(sysYunshuCompanyService.updateSysYunshuCompany(sysYunshuCompany));
    }

    /**
     * 删除运输备案公司
     */
    @PreAuthorize("@ss.hasPermi('system:yunshubeiancompany:remove')")
    @Log(title = "运输备案公司", businessType = BusinessType.DELETE)
	@DeleteMapping("/{companyNames}")
    public AjaxResult remove(@PathVariable String[] companyNames)
    {
        return toAjax(sysYunshuCompanyService.deleteSysYunshuCompanyByCompanyNames(companyNames));
    }
}

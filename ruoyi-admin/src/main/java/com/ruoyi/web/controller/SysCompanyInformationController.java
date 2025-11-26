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
import com.ruoyi.system.domain.SysCompanyInformation;
import com.ruoyi.system.service.ISysCompanyInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 关务公司Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/gwgsinformation")
public class SysCompanyInformationController extends BaseController
{
    @Autowired
    private ISysCompanyInformationService sysCompanyInformationService;

    /**
     * 查询关务公司列表
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCompanyInformation sysCompanyInformation)
    {
        startPage();
        List<SysCompanyInformation> list = sysCompanyInformationService.selectSysCompanyInformationList(sysCompanyInformation);
        return getDataTable(list);
    }

    /**
     * 导出关务公司列表
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:export')")
    @Log(title = "关务公司", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCompanyInformation sysCompanyInformation)
    {
        List<SysCompanyInformation> list = sysCompanyInformationService.selectSysCompanyInformationList(sysCompanyInformation);
        ExcelUtil<SysCompanyInformation> util = new ExcelUtil<SysCompanyInformation>(SysCompanyInformation.class);
        util.exportExcel(response, list, "关务公司数据");
    }

    /**
     * 获取关务公司详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:query')")
    @GetMapping(value = "/{companyName}")
    public AjaxResult getInfo(@PathVariable("companyName") String companyName)
    {
        return success(sysCompanyInformationService.selectSysCompanyInformationByCompanyName(companyName));
    }

    /**
     * 新增关务公司
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:add')")
    @Log(title = "关务公司", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCompanyInformation sysCompanyInformation)
    {
        return toAjax(sysCompanyInformationService.insertSysCompanyInformation(sysCompanyInformation));
    }

    /**
     * 修改关务公司
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:edit')")
    @Log(title = "关务公司", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCompanyInformation sysCompanyInformation)
    {
        return toAjax(sysCompanyInformationService.updateSysCompanyInformation(sysCompanyInformation));
    }

    /**
     * 删除关务公司
     */
    @PreAuthorize("@ss.hasPermi('system:gwgsinformation:remove')")
    @Log(title = "关务公司", businessType = BusinessType.DELETE)
	@DeleteMapping("/{companyNames}")
    public AjaxResult remove(@PathVariable String[] companyNames)
    {
        return toAjax(sysCompanyInformationService.deleteSysCompanyInformationByCompanyNames(companyNames));
    }
}

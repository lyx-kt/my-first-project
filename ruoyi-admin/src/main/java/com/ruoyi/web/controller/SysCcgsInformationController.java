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
import com.ruoyi.system.domain.SysCcgsInformation;
import com.ruoyi.system.service.ISysCcgsInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓储公司认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/ccgsinformation")
public class SysCcgsInformationController extends BaseController
{
    @Autowired
    private ISysCcgsInformationService sysCcgsInformationService;

    /**
     * 查询仓储公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCcgsInformation sysCcgsInformation)
    {
        startPage();
        List<SysCcgsInformation> list = sysCcgsInformationService.selectSysCcgsInformationList(sysCcgsInformation);
        return getDataTable(list);
    }

    /**
     * 导出仓储公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:export')")
    @Log(title = "仓储公司认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCcgsInformation sysCcgsInformation)
    {
        List<SysCcgsInformation> list = sysCcgsInformationService.selectSysCcgsInformationList(sysCcgsInformation);
        ExcelUtil<SysCcgsInformation> util = new ExcelUtil<SysCcgsInformation>(SysCcgsInformation.class);
        util.exportExcel(response, list, "仓储公司认证数据");
    }

    /**
     * 获取仓储公司认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:query')")
    @GetMapping(value = "/{countryGs}")
    public AjaxResult getInfo(@PathVariable("countryGs") String countryGs)
    {
        return success(sysCcgsInformationService.selectSysCcgsInformationByCountryGs(countryGs));
    }

    /**
     * 新增仓储公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:add')")
    @Log(title = "仓储公司认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCcgsInformation sysCcgsInformation)
    {
        return toAjax(sysCcgsInformationService.insertSysCcgsInformation(sysCcgsInformation));
    }

    /**
     * 修改仓储公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:edit')")
    @Log(title = "仓储公司认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCcgsInformation sysCcgsInformation)
    {
        return toAjax(sysCcgsInformationService.updateSysCcgsInformation(sysCcgsInformation));
    }

    /**
     * 删除仓储公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ccgsinformation:remove')")
    @Log(title = "仓储公司认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryGss}")
    public AjaxResult remove(@PathVariable String[] countryGss)
    {
        return toAjax(sysCcgsInformationService.deleteSysCcgsInformationByCountryGss(countryGss));
    }
}

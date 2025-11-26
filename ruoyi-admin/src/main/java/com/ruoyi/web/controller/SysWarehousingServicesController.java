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
import com.ruoyi.system.domain.SysWarehousingServices;
import com.ruoyi.system.service.ISysWarehousingServicesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓储服务Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/ccfwservices")
public class SysWarehousingServicesController extends BaseController
{
    @Autowired
    private ISysWarehousingServicesService sysWarehousingServicesService;

    /**
     * 查询仓储服务列表
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysWarehousingServices sysWarehousingServices)
    {
        startPage();
        List<SysWarehousingServices> list = sysWarehousingServicesService.selectSysWarehousingServicesList(sysWarehousingServices);
        return getDataTable(list);
    }

    /**
     * 导出仓储服务列表
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:export')")
    @Log(title = "仓储服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysWarehousingServices sysWarehousingServices)
    {
        List<SysWarehousingServices> list = sysWarehousingServicesService.selectSysWarehousingServicesList(sysWarehousingServices);
        ExcelUtil<SysWarehousingServices> util = new ExcelUtil<SysWarehousingServices>(SysWarehousingServices.class);
        util.exportExcel(response, list, "仓储服务数据");
    }

    /**
     * 获取仓储服务详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:query')")
    @GetMapping(value = "/{companyName}")
    public AjaxResult getInfo(@PathVariable("companyName") String companyName)
    {
        return success(sysWarehousingServicesService.selectSysWarehousingServicesByCompanyName(companyName));
    }

    /**
     * 新增仓储服务
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:add')")
    @Log(title = "仓储服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysWarehousingServices sysWarehousingServices)
    {
        return toAjax(sysWarehousingServicesService.insertSysWarehousingServices(sysWarehousingServices));
    }

    /**
     * 修改仓储服务
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:edit')")
    @Log(title = "仓储服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysWarehousingServices sysWarehousingServices)
    {
        return toAjax(sysWarehousingServicesService.updateSysWarehousingServices(sysWarehousingServices));
    }

    /**
     * 删除仓储服务
     */
    @PreAuthorize("@ss.hasPermi('system:ccfwservices:remove')")
    @Log(title = "仓储服务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{companyNames}")
    public AjaxResult remove(@PathVariable String[] companyNames)
    {
        return toAjax(sysWarehousingServicesService.deleteSysWarehousingServicesByCompanyNames(companyNames));
    }
}

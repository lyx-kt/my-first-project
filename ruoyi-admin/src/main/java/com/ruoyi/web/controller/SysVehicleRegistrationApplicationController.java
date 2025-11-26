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
import com.ruoyi.system.domain.SysVehicleRegistrationApplication;
import com.ruoyi.system.service.ISysVehicleRegistrationApplicationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/application")
public class SysVehicleRegistrationApplicationController extends BaseController
{
    @Autowired
    private ISysVehicleRegistrationApplicationService sysVehicleRegistrationApplicationService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:application:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        startPage();
        List<SysVehicleRegistrationApplication> list = sysVehicleRegistrationApplicationService.selectSysVehicleRegistrationApplicationList(sysVehicleRegistrationApplication);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:application:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        List<SysVehicleRegistrationApplication> list = sysVehicleRegistrationApplicationService.selectSysVehicleRegistrationApplicationList(sysVehicleRegistrationApplication);
        ExcelUtil<SysVehicleRegistrationApplication> util = new ExcelUtil<SysVehicleRegistrationApplication>(SysVehicleRegistrationApplication.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:application:query')")
    @GetMapping(value = "/{carrierName}")
    public AjaxResult getInfo(@PathVariable("carrierName") String carrierName)
    {
        return success(sysVehicleRegistrationApplicationService.selectSysVehicleRegistrationApplicationByCarrierName(carrierName));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:application:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        return toAjax(sysVehicleRegistrationApplicationService.insertSysVehicleRegistrationApplication(sysVehicleRegistrationApplication));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:application:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        return toAjax(sysVehicleRegistrationApplicationService.updateSysVehicleRegistrationApplication(sysVehicleRegistrationApplication));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:application:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{carrierNames}")
    public AjaxResult remove(@PathVariable String[] carrierNames)
    {
        return toAjax(sysVehicleRegistrationApplicationService.deleteSysVehicleRegistrationApplicationByCarrierNames(carrierNames));
    }
}

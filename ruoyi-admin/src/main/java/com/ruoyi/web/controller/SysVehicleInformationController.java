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
import com.ruoyi.system.domain.SysVehicleInformation;
import com.ruoyi.system.service.ISysVehicleInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线路大厅Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/xldtinformation")
public class SysVehicleInformationController extends BaseController
{
    @Autowired
    private ISysVehicleInformationService sysVehicleInformationService;

    /**
     * 查询线路大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysVehicleInformation sysVehicleInformation)
    {
        startPage();
        List<SysVehicleInformation> list = sysVehicleInformationService.selectSysVehicleInformationList(sysVehicleInformation);
        return getDataTable(list);
    }

    /**
     * 导出线路大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:export')")
    @Log(title = "线路大厅", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysVehicleInformation sysVehicleInformation)
    {
        List<SysVehicleInformation> list = sysVehicleInformationService.selectSysVehicleInformationList(sysVehicleInformation);
        ExcelUtil<SysVehicleInformation> util = new ExcelUtil<SysVehicleInformation>(SysVehicleInformation.class);
        util.exportExcel(response, list, "线路大厅数据");
    }

    /**
     * 获取线路大厅详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:query')")
    @GetMapping(value = "/{placeOfDeparture}")
    public AjaxResult getInfo(@PathVariable("placeOfDeparture") String placeOfDeparture)
    {
        return success(sysVehicleInformationService.selectSysVehicleInformationByPlaceOfDeparture(placeOfDeparture));
    }

    /**
     * 新增线路大厅
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:add')")
    @Log(title = "线路大厅", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysVehicleInformation sysVehicleInformation)
    {
        return toAjax(sysVehicleInformationService.insertSysVehicleInformation(sysVehicleInformation));
    }

    /**
     * 修改线路大厅
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:edit')")
    @Log(title = "线路大厅", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysVehicleInformation sysVehicleInformation)
    {
        return toAjax(sysVehicleInformationService.updateSysVehicleInformation(sysVehicleInformation));
    }

    /**
     * 删除线路大厅
     */
    @PreAuthorize("@ss.hasPermi('system:xldtinformation:remove')")
    @Log(title = "线路大厅", businessType = BusinessType.DELETE)
	@DeleteMapping("/{placeOfDepartures}")
    public AjaxResult remove(@PathVariable String[] placeOfDepartures)
    {
        return toAjax(sysVehicleInformationService.deleteSysVehicleInformationByPlaceOfDepartures(placeOfDepartures));
    }
}

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
import com.ruoyi.system.domain.SysUserLocation;
import com.ruoyi.system.service.ISysUserLocationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户定位记录Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/dwlocation")
public class SysUserLocationController extends BaseController
{
    @Autowired
    private ISysUserLocationService sysUserLocationService;

    /**
     * 查询用户定位记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysUserLocation sysUserLocation)
    {
        startPage();
        List<SysUserLocation> list = sysUserLocationService.selectSysUserLocationList(sysUserLocation);
        return getDataTable(list);
    }

    /**
     * 导出用户定位记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:export')")
    @Log(title = "用户定位记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysUserLocation sysUserLocation)
    {
        List<SysUserLocation> list = sysUserLocationService.selectSysUserLocationList(sysUserLocation);
        ExcelUtil<SysUserLocation> util = new ExcelUtil<SysUserLocation>(SysUserLocation.class);
        util.exportExcel(response, list, "用户定位记录数据");
    }

    /**
     * 获取用户定位记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysUserLocationService.selectSysUserLocationById(id));
    }

    /**
     * 新增用户定位记录
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:add')")
    @Log(title = "用户定位记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysUserLocation sysUserLocation)
    {
        return toAjax(sysUserLocationService.insertSysUserLocation(sysUserLocation));
    }

    /**
     * 修改用户定位记录
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:edit')")
    @Log(title = "用户定位记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysUserLocation sysUserLocation)
    {
        return toAjax(sysUserLocationService.updateSysUserLocation(sysUserLocation));
    }

    /**
     * 删除用户定位记录
     */
    @PreAuthorize("@ss.hasPermi('system:dwlocation:remove')")
    @Log(title = "用户定位记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysUserLocationService.deleteSysUserLocationByIds(ids));
    }
}

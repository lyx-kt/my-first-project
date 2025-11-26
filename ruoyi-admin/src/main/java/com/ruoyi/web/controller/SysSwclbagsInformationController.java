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
import com.ruoyi.system.domain.SysSwclbagsInformation;
import com.ruoyi.system.service.ISysSwclbagsInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 涉外车辆备案公司认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/swclinformation")
public class SysSwclbagsInformationController extends BaseController
{
    @Autowired
    private ISysSwclbagsInformationService sysSwclbagsInformationService;

    /**
     * 查询涉外车辆备案公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSwclbagsInformation sysSwclbagsInformation)
    {
        startPage();
        List<SysSwclbagsInformation> list = sysSwclbagsInformationService.selectSysSwclbagsInformationList(sysSwclbagsInformation);
        return getDataTable(list);
    }

    /**
     * 导出涉外车辆备案公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:export')")
    @Log(title = "涉外车辆备案公司认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSwclbagsInformation sysSwclbagsInformation)
    {
        List<SysSwclbagsInformation> list = sysSwclbagsInformationService.selectSysSwclbagsInformationList(sysSwclbagsInformation);
        ExcelUtil<SysSwclbagsInformation> util = new ExcelUtil<SysSwclbagsInformation>(SysSwclbagsInformation.class);
        util.exportExcel(response, list, "涉外车辆备案公司认证数据");
    }

    /**
     * 获取涉外车辆备案公司认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:query')")
    @GetMapping(value = "/{countryGs}")
    public AjaxResult getInfo(@PathVariable("countryGs") String countryGs)
    {
        return success(sysSwclbagsInformationService.selectSysSwclbagsInformationByCountryGs(countryGs));
    }

    /**
     * 新增涉外车辆备案公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:add')")
    @Log(title = "涉外车辆备案公司认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSwclbagsInformation sysSwclbagsInformation)
    {
        return toAjax(sysSwclbagsInformationService.insertSysSwclbagsInformation(sysSwclbagsInformation));
    }

    /**
     * 修改涉外车辆备案公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:edit')")
    @Log(title = "涉外车辆备案公司认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSwclbagsInformation sysSwclbagsInformation)
    {
        return toAjax(sysSwclbagsInformationService.updateSysSwclbagsInformation(sysSwclbagsInformation));
    }

    /**
     * 删除涉外车辆备案公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:swclinformation:remove')")
    @Log(title = "涉外车辆备案公司认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryGss}")
    public AjaxResult remove(@PathVariable String[] countryGss)
    {
        return toAjax(sysSwclbagsInformationService.deleteSysSwclbagsInformationByCountryGss(countryGss));
    }
}

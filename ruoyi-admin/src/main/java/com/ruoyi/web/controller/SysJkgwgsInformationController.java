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
import com.ruoyi.system.domain.SysJkgwgsInformation;
import com.ruoyi.system.service.ISysJkgwgsInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 进口关务公司认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/jkgwinformation")
public class SysJkgwgsInformationController extends BaseController
{
    @Autowired
    private ISysJkgwgsInformationService sysJkgwgsInformationService;

    /**
     * 查询进口关务公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysJkgwgsInformation sysJkgwgsInformation)
    {
        startPage();
        List<SysJkgwgsInformation> list = sysJkgwgsInformationService.selectSysJkgwgsInformationList(sysJkgwgsInformation);
        return getDataTable(list);
    }

    /**
     * 导出进口关务公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:export')")
    @Log(title = "进口关务公司认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysJkgwgsInformation sysJkgwgsInformation)
    {
        List<SysJkgwgsInformation> list = sysJkgwgsInformationService.selectSysJkgwgsInformationList(sysJkgwgsInformation);
        ExcelUtil<SysJkgwgsInformation> util = new ExcelUtil<SysJkgwgsInformation>(SysJkgwgsInformation.class);
        util.exportExcel(response, list, "进口关务公司认证数据");
    }

    /**
     * 获取进口关务公司认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:query')")
    @GetMapping(value = "/{countryGs}")
    public AjaxResult getInfo(@PathVariable("countryGs") String countryGs)
    {
        return success(sysJkgwgsInformationService.selectSysJkgwgsInformationByCountryGs(countryGs));
    }

    /**
     * 新增进口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:add')")
    @Log(title = "进口关务公司认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysJkgwgsInformation sysJkgwgsInformation)
    {
        return toAjax(sysJkgwgsInformationService.insertSysJkgwgsInformation(sysJkgwgsInformation));
    }

    /**
     * 修改进口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:edit')")
    @Log(title = "进口关务公司认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysJkgwgsInformation sysJkgwgsInformation)
    {
        return toAjax(sysJkgwgsInformationService.updateSysJkgwgsInformation(sysJkgwgsInformation));
    }

    /**
     * 删除进口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:jkgwinformation:remove')")
    @Log(title = "进口关务公司认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryGss}")
    public AjaxResult remove(@PathVariable String[] countryGss)
    {
        return toAjax(sysJkgwgsInformationService.deleteSysJkgwgsInformationByCountryGss(countryGss));
    }
}

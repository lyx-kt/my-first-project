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
import com.ruoyi.system.domain.SysCkgwgsInformation;
import com.ruoyi.system.service.ISysCkgwgsInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出口关务公司认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/ckgwgsinformation")
public class SysCkgwgsInformationController extends BaseController
{
    @Autowired
    private ISysCkgwgsInformationService sysCkgwgsInformationService;

    /**
     * 查询出口关务公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCkgwgsInformation sysCkgwgsInformation)
    {
        startPage();
        List<SysCkgwgsInformation> list = sysCkgwgsInformationService.selectSysCkgwgsInformationList(sysCkgwgsInformation);
        return getDataTable(list);
    }

    /**
     * 导出出口关务公司认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:export')")
    @Log(title = "出口关务公司认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCkgwgsInformation sysCkgwgsInformation)
    {
        List<SysCkgwgsInformation> list = sysCkgwgsInformationService.selectSysCkgwgsInformationList(sysCkgwgsInformation);
        ExcelUtil<SysCkgwgsInformation> util = new ExcelUtil<SysCkgwgsInformation>(SysCkgwgsInformation.class);
        util.exportExcel(response, list, "出口关务公司认证数据");
    }

    /**
     * 获取出口关务公司认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:query')")
    @GetMapping(value = "/{countryGs}")
    public AjaxResult getInfo(@PathVariable("countryGs") String countryGs)
    {
        return success(sysCkgwgsInformationService.selectSysCkgwgsInformationByCountryGs(countryGs));
    }

    /**
     * 新增出口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:add')")
    @Log(title = "出口关务公司认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCkgwgsInformation sysCkgwgsInformation)
    {
        return toAjax(sysCkgwgsInformationService.insertSysCkgwgsInformation(sysCkgwgsInformation));
    }

    /**
     * 修改出口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:edit')")
    @Log(title = "出口关务公司认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCkgwgsInformation sysCkgwgsInformation)
    {
        return toAjax(sysCkgwgsInformationService.updateSysCkgwgsInformation(sysCkgwgsInformation));
    }

    /**
     * 删除出口关务公司认证
     */
    @PreAuthorize("@ss.hasPermi('system:ckgwgsinformation:remove')")
    @Log(title = "出口关务公司认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryGss}")
    public AjaxResult remove(@PathVariable String[] countryGss)
    {
        return toAjax(sysCkgwgsInformationService.deleteSysCkgwgsInformationByCountryGss(countryGss));
    }
}

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
import com.ruoyi.system.domain.SysCyrjgInformation;
import com.ruoyi.system.service.ISysCyrjgInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 承运人机构认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/cyrjginformation")
public class SysCyrjgInformationController extends BaseController
{
    @Autowired
    private ISysCyrjgInformationService sysCyrjgInformationService;

    /**
     * 查询承运人机构认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCyrjgInformation sysCyrjgInformation)
    {
        startPage();
        List<SysCyrjgInformation> list = sysCyrjgInformationService.selectSysCyrjgInformationList(sysCyrjgInformation);
        return getDataTable(list);
    }

    /**
     * 导出承运人机构认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:export')")
    @Log(title = "承运人机构认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCyrjgInformation sysCyrjgInformation)
    {
        List<SysCyrjgInformation> list = sysCyrjgInformationService.selectSysCyrjgInformationList(sysCyrjgInformation);
        ExcelUtil<SysCyrjgInformation> util = new ExcelUtil<SysCyrjgInformation>(SysCyrjgInformation.class);
        util.exportExcel(response, list, "承运人机构认证数据");
    }

    /**
     * 获取承运人机构认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:query')")
    @GetMapping(value = "/{countryGs}")
    public AjaxResult getInfo(@PathVariable("countryGs") String countryGs)
    {
        return success(sysCyrjgInformationService.selectSysCyrjgInformationByCountryGs(countryGs));
    }

    /**
     * 新增承运人机构认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:add')")
    @Log(title = "承运人机构认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCyrjgInformation sysCyrjgInformation)
    {
        return toAjax(sysCyrjgInformationService.insertSysCyrjgInformation(sysCyrjgInformation));
    }

    /**
     * 修改承运人机构认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:edit')")
    @Log(title = "承运人机构认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCyrjgInformation sysCyrjgInformation)
    {
        return toAjax(sysCyrjgInformationService.updateSysCyrjgInformation(sysCyrjgInformation));
    }

    /**
     * 删除承运人机构认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrjginformation:remove')")
    @Log(title = "承运人机构认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryGss}")
    public AjaxResult remove(@PathVariable String[] countryGss)
    {
        return toAjax(sysCyrjgInformationService.deleteSysCyrjgInformationByCountryGss(countryGss));
    }
}

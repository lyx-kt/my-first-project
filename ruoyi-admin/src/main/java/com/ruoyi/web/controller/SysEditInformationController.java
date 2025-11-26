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
import com.ruoyi.system.domain.SysEditInformation;
import com.ruoyi.system.service.ISysEditInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 修改信息Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/xgxxinformation")
public class SysEditInformationController extends BaseController
{
    @Autowired
    private ISysEditInformationService sysEditInformationService;

    /**
     * 查询修改信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysEditInformation sysEditInformation)
    {
        startPage();
        List<SysEditInformation> list = sysEditInformationService.selectSysEditInformationList(sysEditInformation);
        return getDataTable(list);
    }

    /**
     * 导出修改信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:export')")
    @Log(title = "修改信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysEditInformation sysEditInformation)
    {
        List<SysEditInformation> list = sysEditInformationService.selectSysEditInformationList(sysEditInformation);
        ExcelUtil<SysEditInformation> util = new ExcelUtil<SysEditInformation>(SysEditInformation.class);
        util.exportExcel(response, list, "修改信息数据");
    }

    /**
     * 获取修改信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:query')")
    @GetMapping(value = "/{countryId}")
    public AjaxResult getInfo(@PathVariable("countryId") String countryId)
    {
        return success(sysEditInformationService.selectSysEditInformationByCountryId(countryId));
    }

    /**
     * 新增修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:add')")
    @Log(title = "修改信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysEditInformation sysEditInformation)
    {
        return toAjax(sysEditInformationService.insertSysEditInformation(sysEditInformation));
    }

    /**
     * 修改修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:edit')")
    @Log(title = "修改信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysEditInformation sysEditInformation)
    {
        return toAjax(sysEditInformationService.updateSysEditInformation(sysEditInformation));
    }

    /**
     * 删除修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:xgxxinformation:remove')")
    @Log(title = "修改信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{countryIds}")
    public AjaxResult remove(@PathVariable String[] countryIds)
    {
        return toAjax(sysEditInformationService.deleteSysEditInformationByCountryIds(countryIds));
    }
}

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
import com.ruoyi.system.domain.SysCarrierInformation;
import com.ruoyi.system.service.ISysCarrierInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 线路详情Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/xlxqcyrinformation")
public class SysCarrierInformationController extends BaseController
{
    @Autowired
    private ISysCarrierInformationService sysCarrierInformationService;

    /**
     * 查询线路详情列表
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCarrierInformation sysCarrierInformation)
    {
        startPage();
        List<SysCarrierInformation> list = sysCarrierInformationService.selectSysCarrierInformationList(sysCarrierInformation);
        return getDataTable(list);
    }

    /**
     * 导出线路详情列表
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:export')")
    @Log(title = "线路详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCarrierInformation sysCarrierInformation)
    {
        List<SysCarrierInformation> list = sysCarrierInformationService.selectSysCarrierInformationList(sysCarrierInformation);
        ExcelUtil<SysCarrierInformation> util = new ExcelUtil<SysCarrierInformation>(SysCarrierInformation.class);
        util.exportExcel(response, list, "线路详情数据");
    }

    /**
     * 获取线路详情详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:query')")
    @GetMapping(value = "/{carrierNamecarrier}")
    public AjaxResult getInfo(@PathVariable("carrierNamecarrier") String carrierNamecarrier)
    {
        return success(sysCarrierInformationService.selectSysCarrierInformationByCarrierNamecarrier(carrierNamecarrier));
    }

    /**
     * 新增线路详情
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:add')")
    @Log(title = "线路详情", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCarrierInformation sysCarrierInformation)
    {
        return toAjax(sysCarrierInformationService.insertSysCarrierInformation(sysCarrierInformation));
    }

    /**
     * 修改线路详情
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:edit')")
    @Log(title = "线路详情", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCarrierInformation sysCarrierInformation)
    {
        return toAjax(sysCarrierInformationService.updateSysCarrierInformation(sysCarrierInformation));
    }

    /**
     * 删除线路详情
     */
    @PreAuthorize("@ss.hasPermi('system:xlxqcyrinformation:remove')")
    @Log(title = "线路详情", businessType = BusinessType.DELETE)
	@DeleteMapping("/{carrierNamecarriers}")
    public AjaxResult remove(@PathVariable String[] carrierNamecarriers)
    {
        return toAjax(sysCarrierInformationService.deleteSysCarrierInformationByCarrierNamecarriers(carrierNamecarriers));
    }
}

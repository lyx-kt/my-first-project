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
import com.ruoyi.system.domain.SysCargoInformation;
import com.ruoyi.system.service.ISysCargoInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货源大厅Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/hydtinformation")
public class SysCargoInformationController extends BaseController
{
    @Autowired
    private ISysCargoInformationService sysCargoInformationService;

    /**
     * 查询货源大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCargoInformation sysCargoInformation)
    {
        startPage();
        List<SysCargoInformation> list = sysCargoInformationService.selectSysCargoInformationList(sysCargoInformation);
        return getDataTable(list);
    }

    /**
     * 导出货源大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:export')")
    @Log(title = "货源大厅", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCargoInformation sysCargoInformation)
    {
        List<SysCargoInformation> list = sysCargoInformationService.selectSysCargoInformationList(sysCargoInformation);
        ExcelUtil<SysCargoInformation> util = new ExcelUtil<SysCargoInformation>(SysCargoInformation.class);
        util.exportExcel(response, list, "货源大厅数据");
    }

    /**
     * 获取货源大厅详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:query')")
    @GetMapping(value = "/{orderNumber}")
    public AjaxResult getInfo(@PathVariable("orderNumber") String orderNumber)
    {
        return success(sysCargoInformationService.selectSysCargoInformationByOrderNumber(orderNumber));
    }

    /**
     * 新增货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:add')")
    @Log(title = "货源大厅", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCargoInformation sysCargoInformation)
    {
        return toAjax(sysCargoInformationService.insertSysCargoInformation(sysCargoInformation));
    }

    /**
     * 修改货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:edit')")
    @Log(title = "货源大厅", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCargoInformation sysCargoInformation)
    {
        return toAjax(sysCargoInformationService.updateSysCargoInformation(sysCargoInformation));
    }

    /**
     * 删除货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:hydtinformation:remove')")
    @Log(title = "货源大厅", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderNumbers}")
    public AjaxResult remove(@PathVariable String[] orderNumbers)
    {
        return toAjax(sysCargoInformationService.deleteSysCargoInformationByOrderNumbers(orderNumbers));
    }
}

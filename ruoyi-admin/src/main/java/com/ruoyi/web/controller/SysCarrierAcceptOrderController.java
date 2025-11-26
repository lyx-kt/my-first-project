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
import com.ruoyi.system.domain.SysCarrierAcceptOrder;
import com.ruoyi.system.service.ISysCarrierAcceptOrderService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 货源大厅Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/huoyuandatorder")
public class SysCarrierAcceptOrderController extends BaseController
{
    @Autowired
    private ISysCarrierAcceptOrderService sysCarrierAcceptOrderService;

    /**
     * 查询货源大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        startPage();
        List<SysCarrierAcceptOrder> list = sysCarrierAcceptOrderService.selectSysCarrierAcceptOrderList(sysCarrierAcceptOrder);
        return getDataTable(list);
    }

    /**
     * 导出货源大厅列表
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:export')")
    @Log(title = "货源大厅", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        List<SysCarrierAcceptOrder> list = sysCarrierAcceptOrderService.selectSysCarrierAcceptOrderList(sysCarrierAcceptOrder);
        ExcelUtil<SysCarrierAcceptOrder> util = new ExcelUtil<SysCarrierAcceptOrder>(SysCarrierAcceptOrder.class);
        util.exportExcel(response, list, "货源大厅数据");
    }

    /**
     * 获取货源大厅详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:query')")
    @GetMapping(value = "/{cargoInformation}")
    public AjaxResult getInfo(@PathVariable("cargoInformation") String cargoInformation)
    {
        return success(sysCarrierAcceptOrderService.selectSysCarrierAcceptOrderByCargoInformation(cargoInformation));
    }

    /**
     * 新增货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:add')")
    @Log(title = "货源大厅", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        return toAjax(sysCarrierAcceptOrderService.insertSysCarrierAcceptOrder(sysCarrierAcceptOrder));
    }

    /**
     * 修改货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:edit')")
    @Log(title = "货源大厅", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        return toAjax(sysCarrierAcceptOrderService.updateSysCarrierAcceptOrder(sysCarrierAcceptOrder));
    }

    /**
     * 删除货源大厅
     */
    @PreAuthorize("@ss.hasPermi('system:huoyuandatorder:remove')")
    @Log(title = "货源大厅", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cargoInformations}")
    public AjaxResult remove(@PathVariable String[] cargoInformations)
    {
        return toAjax(sysCarrierAcceptOrderService.deleteSysCarrierAcceptOrderByCargoInformations(cargoInformations));
    }
}

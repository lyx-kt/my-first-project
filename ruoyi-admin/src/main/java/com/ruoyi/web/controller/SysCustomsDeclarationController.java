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
import com.ruoyi.system.domain.SysCustomsDeclaration;
import com.ruoyi.system.service.ISysCustomsDeclarationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 承运人确报Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/cyrqbdeclaration")
public class SysCustomsDeclarationController extends BaseController
{
    @Autowired
    private ISysCustomsDeclarationService sysCustomsDeclarationService;

    /**
     * 查询承运人确报列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCustomsDeclaration sysCustomsDeclaration)
    {
        startPage();
        List<SysCustomsDeclaration> list = sysCustomsDeclarationService.selectSysCustomsDeclarationList(sysCustomsDeclaration);
        return getDataTable(list);
    }

    /**
     * 导出承运人确报列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:export')")
    @Log(title = "承运人确报", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCustomsDeclaration sysCustomsDeclaration)
    {
        List<SysCustomsDeclaration> list = sysCustomsDeclarationService.selectSysCustomsDeclarationList(sysCustomsDeclaration);
        ExcelUtil<SysCustomsDeclaration> util = new ExcelUtil<SysCustomsDeclaration>(SysCustomsDeclaration.class);
        util.exportExcel(response, list, "承运人确报数据");
    }

    /**
     * 获取承运人确报详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:query')")
    @GetMapping(value = "/{carrierName}")
    public AjaxResult getInfo(@PathVariable("carrierName") String carrierName)
    {
        return success(sysCustomsDeclarationService.selectSysCustomsDeclarationByCarrierName(carrierName));
    }

    /**
     * 新增承运人确报
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:add')")
    @Log(title = "承运人确报", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCustomsDeclaration sysCustomsDeclaration)
    {
        return toAjax(sysCustomsDeclarationService.insertSysCustomsDeclaration(sysCustomsDeclaration));
    }

    /**
     * 修改承运人确报
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:edit')")
    @Log(title = "承运人确报", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCustomsDeclaration sysCustomsDeclaration)
    {
        return toAjax(sysCustomsDeclarationService.updateSysCustomsDeclaration(sysCustomsDeclaration));
    }

    /**
     * 删除承运人确报
     */
    @PreAuthorize("@ss.hasPermi('system:cyrqbdeclaration:remove')")
    @Log(title = "承运人确报", businessType = BusinessType.DELETE)
	@DeleteMapping("/{carrierNames}")
    public AjaxResult remove(@PathVariable String[] carrierNames)
    {
        return toAjax(sysCustomsDeclarationService.deleteSysCustomsDeclarationByCarrierNames(carrierNames));
    }
}

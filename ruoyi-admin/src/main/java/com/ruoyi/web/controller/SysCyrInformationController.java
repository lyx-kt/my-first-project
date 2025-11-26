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
import com.ruoyi.system.domain.SysCyrInformation;
import com.ruoyi.system.service.ISysCyrInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 承运人实名认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/cyrrzinformation")
public class SysCyrInformationController extends BaseController
{
    @Autowired
    private ISysCyrInformationService sysCyrInformationService;

    /**
     * 查询承运人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCyrInformation sysCyrInformation)
    {
        startPage();
        List<SysCyrInformation> list = sysCyrInformationService.selectSysCyrInformationList(sysCyrInformation);
        return getDataTable(list);
    }

    /**
     * 导出承运人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:export')")
    @Log(title = "承运人实名认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCyrInformation sysCyrInformation)
    {
        List<SysCyrInformation> list = sysCyrInformationService.selectSysCyrInformationList(sysCyrInformation);
        ExcelUtil<SysCyrInformation> util = new ExcelUtil<SysCyrInformation>(SysCyrInformation.class);
        util.exportExcel(response, list, "承运人实名认证数据");
    }

    /**
     * 获取承运人实名认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:query')")
    @GetMapping(value = "/{ccountry}")
    public AjaxResult getInfo(@PathVariable("ccountry") String ccountry)
    {
        return success(sysCyrInformationService.selectSysCyrInformationByCcountry(ccountry));
    }

    /**
     * 新增承运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:add')")
    @Log(title = "承运人实名认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCyrInformation sysCyrInformation)
    {
        return toAjax(sysCyrInformationService.insertSysCyrInformation(sysCyrInformation));
    }

    /**
     * 修改承运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:edit')")
    @Log(title = "承运人实名认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCyrInformation sysCyrInformation)
    {
        return toAjax(sysCyrInformationService.updateSysCyrInformation(sysCyrInformation));
    }

    /**
     * 删除承运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:cyrrzinformation:remove')")
    @Log(title = "承运人实名认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ccountrys}")
    public AjaxResult remove(@PathVariable String[] ccountrys)
    {
        return toAjax(sysCyrInformationService.deleteSysCyrInformationByCcountrys(ccountrys));
    }
}

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
import com.ruoyi.system.domain.SysFyrInformation;
import com.ruoyi.system.service.ISysFyrInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 发运人实名认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/fyrsmrzinformation")
public class SysFyrInformationController extends BaseController
{
    @Autowired
    private ISysFyrInformationService sysFyrInformationService;

    /**
     * 查询发运人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysFyrInformation sysFyrInformation)
    {
        startPage();
        List<SysFyrInformation> list = sysFyrInformationService.selectSysFyrInformationList(sysFyrInformation);
        return getDataTable(list);
    }

    /**
     * 导出发运人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:export')")
    @Log(title = "发运人实名认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysFyrInformation sysFyrInformation)
    {
        List<SysFyrInformation> list = sysFyrInformationService.selectSysFyrInformationList(sysFyrInformation);
        ExcelUtil<SysFyrInformation> util = new ExcelUtil<SysFyrInformation>(SysFyrInformation.class);
        util.exportExcel(response, list, "发运人实名认证数据");
    }

    /**
     * 获取发运人实名认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:query')")
    @GetMapping(value = "/{fcountry}")
    public AjaxResult getInfo(@PathVariable("fcountry") String fcountry)
    {
        return success(sysFyrInformationService.selectSysFyrInformationByFcountry(fcountry));
    }

    /**
     * 新增发运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:add')")
    @Log(title = "发运人实名认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysFyrInformation sysFyrInformation)
    {
        return toAjax(sysFyrInformationService.insertSysFyrInformation(sysFyrInformation));
    }

    /**
     * 修改发运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:edit')")
    @Log(title = "发运人实名认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysFyrInformation sysFyrInformation)
    {
        return toAjax(sysFyrInformationService.updateSysFyrInformation(sysFyrInformation));
    }

    /**
     * 删除发运人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:fyrsmrzinformation:remove')")
    @Log(title = "发运人实名认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fcountrys}")
    public AjaxResult remove(@PathVariable String[] fcountrys)
    {
        return toAjax(sysFyrInformationService.deleteSysFyrInformationByFcountrys(fcountrys));
    }
}

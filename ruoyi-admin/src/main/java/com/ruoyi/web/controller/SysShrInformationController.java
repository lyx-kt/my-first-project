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
import com.ruoyi.system.domain.SysShrInformation;
import com.ruoyi.system.service.ISysShrInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收货人实名认证Controller
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/shrrzinformation")
public class SysShrInformationController extends BaseController
{
    @Autowired
    private ISysShrInformationService sysShrInformationService;

    /**
     * 查询收货人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysShrInformation sysShrInformation)
    {
        startPage();
        List<SysShrInformation> list = sysShrInformationService.selectSysShrInformationList(sysShrInformation);
        return getDataTable(list);
    }

    /**
     * 导出收货人实名认证列表
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:export')")
    @Log(title = "收货人实名认证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysShrInformation sysShrInformation)
    {
        List<SysShrInformation> list = sysShrInformationService.selectSysShrInformationList(sysShrInformation);
        ExcelUtil<SysShrInformation> util = new ExcelUtil<SysShrInformation>(SysShrInformation.class);
        util.exportExcel(response, list, "收货人实名认证数据");
    }

    /**
     * 获取收货人实名认证详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:query')")
    @GetMapping(value = "/{scountry}")
    public AjaxResult getInfo(@PathVariable("scountry") String scountry)
    {
        return success(sysShrInformationService.selectSysShrInformationByScountry(scountry));
    }

    /**
     * 新增收货人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:add')")
    @Log(title = "收货人实名认证", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysShrInformation sysShrInformation)
    {
        return toAjax(sysShrInformationService.insertSysShrInformation(sysShrInformation));
    }

    /**
     * 修改收货人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:edit')")
    @Log(title = "收货人实名认证", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysShrInformation sysShrInformation)
    {
        return toAjax(sysShrInformationService.updateSysShrInformation(sysShrInformation));
    }

    /**
     * 删除收货人实名认证
     */
    @PreAuthorize("@ss.hasPermi('system:shrrzinformation:remove')")
    @Log(title = "收货人实名认证", businessType = BusinessType.DELETE)
	@DeleteMapping("/{scountrys}")
    public AjaxResult remove(@PathVariable String[] scountrys)
    {
        return toAjax(sysShrInformationService.deleteSysShrInformationByScountrys(scountrys));
    }
}

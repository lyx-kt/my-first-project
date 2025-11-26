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
import com.ruoyi.system.domain.SysCompanyProfile;
import com.ruoyi.system.service.ISysCompanyProfileService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 企业信息简介价格清单Controller
 * 
 * @author ruoyi
 * @date 2025-11-14
 */
@RestController
@RequestMapping("/system/profile")
public class SysCompanyProfileController extends BaseController
{
    @Autowired
    private ISysCompanyProfileService sysCompanyProfileService;

    /**
     * 查询企业信息简介价格清单列表
     */
    @PreAuthorize("@ss.hasPermi('system:profile:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysCompanyProfile sysCompanyProfile)
    {
        startPage();
        List<SysCompanyProfile> list = sysCompanyProfileService.selectSysCompanyProfileList(sysCompanyProfile);
        return getDataTable(list);
    }

    /**
     * 导出企业信息简介价格清单列表
     */
    @PreAuthorize("@ss.hasPermi('system:profile:export')")
    @Log(title = "企业信息简介价格清单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysCompanyProfile sysCompanyProfile)
    {
        List<SysCompanyProfile> list = sysCompanyProfileService.selectSysCompanyProfileList(sysCompanyProfile);
        ExcelUtil<SysCompanyProfile> util = new ExcelUtil<SysCompanyProfile>(SysCompanyProfile.class);
        util.exportExcel(response, list, "企业信息简介价格清单数据");
    }

    /**
     * 获取企业信息简介价格清单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:profile:query')")
    @GetMapping(value = "/{companyProfile}")
    public AjaxResult getInfo(@PathVariable("companyProfile") String companyProfile)
    {
        return success(sysCompanyProfileService.selectSysCompanyProfileByCompanyProfile(companyProfile));
    }

    /**
     * 新增企业信息简介价格清单
     */
    @PreAuthorize("@ss.hasPermi('system:profile:add')")
    @Log(title = "企业信息简介价格清单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysCompanyProfile sysCompanyProfile)
    {
        return toAjax(sysCompanyProfileService.insertSysCompanyProfile(sysCompanyProfile));
    }

    /**
     * 修改企业信息简介价格清单
     */
    @PreAuthorize("@ss.hasPermi('system:profile:edit')")
    @Log(title = "企业信息简介价格清单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysCompanyProfile sysCompanyProfile)
    {
        return toAjax(sysCompanyProfileService.updateSysCompanyProfile(sysCompanyProfile));
    }

    /**
     * 删除企业信息简介价格清单
     */
    @PreAuthorize("@ss.hasPermi('system:profile:remove')")
    @Log(title = "企业信息简介价格清单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{companyProfiles}")
    public AjaxResult remove(@PathVariable String[] companyProfiles)
    {
        return toAjax(sysCompanyProfileService.deleteSysCompanyProfileByCompanyProfiles(companyProfiles));
    }
}

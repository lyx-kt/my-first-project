package com.ruoyi.web.controller.tool;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysGpsInformation;
import com.ruoyi.system.service.ISysGpsInformationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户定位表Controller
 *
 * @author ruoyi
 * @date 2025-11-19
 */
@RestController
@RequestMapping("/system/yhdwinformation")

public class SysGpsInformationController extends BaseController {
    private final ISysGpsInformationService sysGpsInformationService;

    public SysGpsInformationController(ISysGpsInformationService sysGpsInformationService) {
        this.sysGpsInformationService = sysGpsInformationService;
    }

    /**
     * 查询用户定位表列表
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGpsInformation sysGpsInformation) {
        startPage();
        List<SysGpsInformation> list = sysGpsInformationService.selectSysGpsInformationList(sysGpsInformation);
        return getDataTable(list);
    }

    /**
     * 导出用户定位表列表
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:export')")
    @Log(title = "用户定位表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysGpsInformation sysGpsInformation) {
        List<SysGpsInformation> list = sysGpsInformationService.selectSysGpsInformationList(sysGpsInformation);
        ExcelUtil<SysGpsInformation> util = new ExcelUtil<>(SysGpsInformation.class);
        util.exportExcel(response, list, "用户定位表数据");
    }

    /**
     * 获取用户定位表详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") String userId) {
        return success(sysGpsInformationService.selectSysGpsInformationByUserId(userId));
    }

    /**
     * 新增用户定位表
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:add')")
    @Log(title = "用户定位表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysGpsInformation sysGpsInformation) {
        return toAjax(sysGpsInformationService.insertSysGpsInformation(sysGpsInformation));
    }

    /**
     * 修改用户定位表
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:edit')")
    @Log(title = "用户定位表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysGpsInformation sysGpsInformation) {
        return toAjax(sysGpsInformationService.updateSysGpsInformation(sysGpsInformation));
    }

    /**
     * 删除用户定位表
     */
    @PreAuthorize("@ss.hasPermi('system:yhdwinformation:remove')")
    @Log(title = "用户定位表", businessType = BusinessType.DELETE)
    @DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable String[] userIds) {
        return toAjax(sysGpsInformationService.deleteSysGpsInformationByUserIds(userIds));
    }

    /**
     * 接收设备上传的GPS数据
     */
    @PostMapping("/upload")
    public AjaxResult uploadGps(@RequestBody SysGpsInformation sysGpsInformation) {
        // 设置创建时间为当前时间
        sysGpsInformation.setCreateTime(DateUtils.getNowDate());
        // 调用service保存
        return toAjax(sysGpsInformationService.insertSysGpsInformation(sysGpsInformation));
    }

    /**
     * 保存用户定位信息
     */
    @PostMapping("/save")
    @ApiOperation("保存用户定位信息")
    public AjaxResult saveLocation(@RequestBody SysGpsInformation gpsInformation) {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        // 设置当前登录用户ID
        gpsInformation.setUserId(String.valueOf(loginUser.getUserId()));
        // 设置定位时间
        gpsInformation.setLocationTime(DateUtils.getNowDate());
        return AjaxResult.success(sysGpsInformationService.saveGpsInformation(gpsInformation));
    }
    /**
     * 获取当前用户最新定位
     */
    @GetMapping("/latest")
    @ApiOperation("获取当前用户最新定位")
    public AjaxResult getLatestLocation() {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        SysGpsInformation gpsInformation = sysGpsInformationService.getUserLatestLocation(loginUser.getUserId());
        return AjaxResult.success(gpsInformation);
    }

    /**
     * 根据用户ID获取定位(管理员接口)
     */
    @GetMapping("/user/{userId}")
    @ApiOperation("根据用户ID获取定位")
    public AjaxResult getUserLocation(@PathVariable Long userId) {
        // 权限校验...
        SysGpsInformation gpsInformation = sysGpsInformationService.getUserLatestLocation(userId);
        return AjaxResult.success(gpsInformation);
    }
}


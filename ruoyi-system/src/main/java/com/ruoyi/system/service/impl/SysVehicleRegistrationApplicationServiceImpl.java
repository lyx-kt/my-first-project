package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysVehicleRegistrationApplicationMapper;
import com.ruoyi.system.domain.SysVehicleRegistrationApplication;
import com.ruoyi.system.service.ISysVehicleRegistrationApplicationService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysVehicleRegistrationApplicationServiceImpl implements ISysVehicleRegistrationApplicationService 
{
    @Autowired
    private SysVehicleRegistrationApplicationMapper sysVehicleRegistrationApplicationMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param carrierName 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysVehicleRegistrationApplication selectSysVehicleRegistrationApplicationByCarrierName(String carrierName)
    {
        return sysVehicleRegistrationApplicationMapper.selectSysVehicleRegistrationApplicationByCarrierName(carrierName);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysVehicleRegistrationApplication> selectSysVehicleRegistrationApplicationList(SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        return sysVehicleRegistrationApplicationMapper.selectSysVehicleRegistrationApplicationList(sysVehicleRegistrationApplication);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysVehicleRegistrationApplication(SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        sysVehicleRegistrationApplication.setCreateTime(DateUtils.getNowDate());
        return sysVehicleRegistrationApplicationMapper.insertSysVehicleRegistrationApplication(sysVehicleRegistrationApplication);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysVehicleRegistrationApplication(SysVehicleRegistrationApplication sysVehicleRegistrationApplication)
    {
        return sysVehicleRegistrationApplicationMapper.updateSysVehicleRegistrationApplication(sysVehicleRegistrationApplication);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param carrierNames 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVehicleRegistrationApplicationByCarrierNames(String[] carrierNames)
    {
        return sysVehicleRegistrationApplicationMapper.deleteSysVehicleRegistrationApplicationByCarrierNames(carrierNames);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param carrierName 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVehicleRegistrationApplicationByCarrierName(String carrierName)
    {
        return sysVehicleRegistrationApplicationMapper.deleteSysVehicleRegistrationApplicationByCarrierName(carrierName);
    }
}

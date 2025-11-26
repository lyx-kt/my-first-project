package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.SysGpsInformation;
import com.ruoyi.system.mapper.SysGpsInformationMapper;
import com.ruoyi.system.service.ISysGpsInformationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户定位表Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public  class SysGpsInformationServiceImpl implements ISysGpsInformationService
{
    private final SysGpsInformationMapper sysGpsInformationMapper;

    public SysGpsInformationServiceImpl(SysGpsInformationMapper sysGpsInformationMapper) {
        this.sysGpsInformationMapper = sysGpsInformationMapper;
    }

    /**
     * 查询用户定位表
     * 
     * @param userId 用户定位表主键
     * @return 用户定位表
     */
    @Override
    public SysGpsInformation selectSysGpsInformationByUserId(String userId)
    {
        return sysGpsInformationMapper.selectSysGpsInformationByUserId(userId);
    }

    /**
     * 查询用户定位表列表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 用户定位表
     */
    @Override
    public List<SysGpsInformation> selectSysGpsInformationList(SysGpsInformation sysGpsInformation)
    {
        return sysGpsInformationMapper.selectSysGpsInformationList(sysGpsInformation);
    }

    /**
     * 新增用户定位表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 结果
     */
    @Override
    public int insertSysGpsInformation(SysGpsInformation sysGpsInformation)
    {
        sysGpsInformation.setCreateTime(DateUtils.getNowDate());
        return sysGpsInformationMapper.insertSysGpsInformation(sysGpsInformation);
    }

    /**
     * 修改用户定位表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 结果
     */
    @Override
    public int updateSysGpsInformation(SysGpsInformation sysGpsInformation)
    {
        return sysGpsInformationMapper.updateSysGpsInformation(sysGpsInformation);
    }

    /**
     * 批量删除用户定位表
     * 
     * @param userIds 需要删除的用户定位表主键
     * @return 结果
     */
    @Override
    public int deleteSysGpsInformationByUserIds(String[] userIds)
    {
        return sysGpsInformationMapper.deleteSysGpsInformationByUserIds(userIds);
    }

    /**
     * 删除用户定位表信息
     * 
     * @param userId 用户定位表主键
     * @return 结果
     */
    @Override
    public int deleteSysGpsInformationByUserId(String userId)
    {
        return sysGpsInformationMapper.deleteSysGpsInformationByUserId(userId);
    }

    /**
     * 保存用户定位信息
     * 
     * @param gpsInformation GPS定位信息
     * @return 保存结果
     */
    @Override
    public boolean saveGpsInformation(SysGpsInformation gpsInformation) {
        // 设置创建时间
        if (gpsInformation.getCreateTime() == null) {
            gpsInformation.setCreateTime(DateUtils.getNowDate());
        }
        // 如果没有定位时间，使用当前时间
        if (gpsInformation.getLocationTime() == null) {
            gpsInformation.setLocationTime(DateUtils.getNowDate());
        }
        
        // 插入数据库
        int result = sysGpsInformationMapper.insertSysGpsInformation(gpsInformation);
        return result > 0;
    }

    /**
     * 获取用户最新定位信息
     * 
     * @param userId 用户ID
     * @return 最新定位信息
     */
    @Override
    public SysGpsInformation getUserLatestLocation(Long userId) {
        return sysGpsInformationMapper.getUserLatestLocation(userId);
    }

}

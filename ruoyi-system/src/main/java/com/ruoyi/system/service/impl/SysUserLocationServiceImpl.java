package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysUserLocationMapper;
import com.ruoyi.system.domain.SysUserLocation;
import com.ruoyi.system.service.ISysUserLocationService;

/**
 * 用户定位记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysUserLocationServiceImpl implements ISysUserLocationService 
{
    @Autowired
    private SysUserLocationMapper sysUserLocationMapper;

    /**
     * 查询用户定位记录
     * 
     * @param id 用户定位记录主键
     * @return 用户定位记录
     */
    @Override
    public SysUserLocation selectSysUserLocationById(Long id)
    {
        return sysUserLocationMapper.selectSysUserLocationById(id);
    }

    /**
     * 查询用户定位记录列表
     * 
     * @param sysUserLocation 用户定位记录
     * @return 用户定位记录
     */
    @Override
    public List<SysUserLocation> selectSysUserLocationList(SysUserLocation sysUserLocation)
    {
        return sysUserLocationMapper.selectSysUserLocationList(sysUserLocation);
    }

    /**
     * 新增用户定位记录
     * 
     * @param sysUserLocation 用户定位记录
     * @return 结果
     */
    @Override
    public int insertSysUserLocation(SysUserLocation sysUserLocation)
    {
        sysUserLocation.setCreateTime(DateUtils.getNowDate());
        return sysUserLocationMapper.insertSysUserLocation(sysUserLocation);
    }

    /**
     * 修改用户定位记录
     * 
     * @param sysUserLocation 用户定位记录
     * @return 结果
     */
    @Override
    public int updateSysUserLocation(SysUserLocation sysUserLocation)
    {
        return sysUserLocationMapper.updateSysUserLocation(sysUserLocation);
    }

    /**
     * 批量删除用户定位记录
     * 
     * @param ids 需要删除的用户定位记录主键
     * @return 结果
     */
    @Override
    public int deleteSysUserLocationByIds(Long[] ids)
    {
        return sysUserLocationMapper.deleteSysUserLocationByIds(ids);
    }

    /**
     * 删除用户定位记录信息
     * 
     * @param id 用户定位记录主键
     * @return 结果
     */
    @Override
    public int deleteSysUserLocationById(Long id)
    {
        return sysUserLocationMapper.deleteSysUserLocationById(id);
    }
}

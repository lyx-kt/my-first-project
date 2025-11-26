package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysUserLocation;

/**
 * 用户定位记录Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysUserLocationService 
{
    /**
     * 查询用户定位记录
     * 
     * @param id 用户定位记录主键
     * @return 用户定位记录
     */
    public SysUserLocation selectSysUserLocationById(Long id);

    /**
     * 查询用户定位记录列表
     * 
     * @param sysUserLocation 用户定位记录
     * @return 用户定位记录集合
     */
    public List<SysUserLocation> selectSysUserLocationList(SysUserLocation sysUserLocation);

    /**
     * 新增用户定位记录
     * 
     * @param sysUserLocation 用户定位记录
     * @return 结果
     */
    public int insertSysUserLocation(SysUserLocation sysUserLocation);

    /**
     * 修改用户定位记录
     * 
     * @param sysUserLocation 用户定位记录
     * @return 结果
     */
    public int updateSysUserLocation(SysUserLocation sysUserLocation);

    /**
     * 批量删除用户定位记录
     * 
     * @param ids 需要删除的用户定位记录主键集合
     * @return 结果
     */
    public int deleteSysUserLocationByIds(Long[] ids);

    /**
     * 删除用户定位记录信息
     * 
     * @param id 用户定位记录主键
     * @return 结果
     */
    public int deleteSysUserLocationById(Long id);
}

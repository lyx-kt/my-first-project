package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysGpsInformation;

import java.util.List;

/**
 * 用户定位表Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysGpsInformationService
{
    /**
     * 查询用户定位表
     * 
     * @param userId 用户定位表主键
     * @return 用户定位表
     */
    public SysGpsInformation selectSysGpsInformationByUserId(String userId);

    /**
     * 查询用户定位表列表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 用户定位表集合
     */
    public List<SysGpsInformation> selectSysGpsInformationList(SysGpsInformation sysGpsInformation);

    /**
     * 新增用户定位表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 结果
     */
    public int insertSysGpsInformation(SysGpsInformation sysGpsInformation);

    /**
     * 修改用户定位表
     * 
     * @param sysGpsInformation 用户定位表
     * @return 结果
     */
    public int updateSysGpsInformation(SysGpsInformation sysGpsInformation);

    /**
     * 批量删除用户定位表
     * 
     * @param userIds 需要删除的用户定位表主键集合
     * @return 结果
     */
    public int deleteSysGpsInformationByUserIds(String[] userIds);

    /**
     * 删除用户定位表信息
     * 
     * @param userId 用户定位表主键
     * @return 结果
     */
    public int deleteSysGpsInformationByUserId(String userId);
    /**
     * 保护用户定位信息
     */
    boolean saveGpsInformation(SysGpsInformation GpsInformation);

    SysGpsInformation getUserLatestLocation(Long userId);


}

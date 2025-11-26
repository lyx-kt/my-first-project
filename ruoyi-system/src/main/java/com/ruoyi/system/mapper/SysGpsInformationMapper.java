package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysGpsInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户定位表Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Mapper
public interface SysGpsInformationMapper 
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
     * 删除用户定位表
     * 
     * @param userId 用户定位表主键
     * @return 结果
     */
    public int deleteSysGpsInformationByUserId(String userId);

    /**
     * 批量删除用户定位表
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysGpsInformationByUserIds(String[] userIds);

    /**
     * 获取用户最新定位信息
     * 
     * @param userId 用户ID
     * @return 用户最新定位信息
     */
    public SysGpsInformation getUserLatestLocation(Long userId);
}

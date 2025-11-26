package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysSwclbagsInformation;

/**
 * 涉外车辆备案公司认证Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysSwclbagsInformationService 
{
    /**
     * 查询涉外车辆备案公司认证
     * 
     * @param countryGs 涉外车辆备案公司认证主键
     * @return 涉外车辆备案公司认证
     */
    public SysSwclbagsInformation selectSysSwclbagsInformationByCountryGs(String countryGs);

    /**
     * 查询涉外车辆备案公司认证列表
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 涉外车辆备案公司认证集合
     */
    public List<SysSwclbagsInformation> selectSysSwclbagsInformationList(SysSwclbagsInformation sysSwclbagsInformation);

    /**
     * 新增涉外车辆备案公司认证
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 结果
     */
    public int insertSysSwclbagsInformation(SysSwclbagsInformation sysSwclbagsInformation);

    /**
     * 修改涉外车辆备案公司认证
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 结果
     */
    public int updateSysSwclbagsInformation(SysSwclbagsInformation sysSwclbagsInformation);

    /**
     * 批量删除涉外车辆备案公司认证
     * 
     * @param countryGss 需要删除的涉外车辆备案公司认证主键集合
     * @return 结果
     */
    public int deleteSysSwclbagsInformationByCountryGss(String[] countryGss);

    /**
     * 删除涉外车辆备案公司认证信息
     * 
     * @param countryGs 涉外车辆备案公司认证主键
     * @return 结果
     */
    public int deleteSysSwclbagsInformationByCountryGs(String countryGs);
}

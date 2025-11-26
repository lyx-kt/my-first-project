package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSwclbagsInformationMapper;
import com.ruoyi.system.domain.SysSwclbagsInformation;
import com.ruoyi.system.service.ISysSwclbagsInformationService;

/**
 * 涉外车辆备案公司认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysSwclbagsInformationServiceImpl implements ISysSwclbagsInformationService 
{
    @Autowired
    private SysSwclbagsInformationMapper sysSwclbagsInformationMapper;

    /**
     * 查询涉外车辆备案公司认证
     * 
     * @param countryGs 涉外车辆备案公司认证主键
     * @return 涉外车辆备案公司认证
     */
    @Override
    public SysSwclbagsInformation selectSysSwclbagsInformationByCountryGs(String countryGs)
    {
        return sysSwclbagsInformationMapper.selectSysSwclbagsInformationByCountryGs(countryGs);
    }

    /**
     * 查询涉外车辆备案公司认证列表
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 涉外车辆备案公司认证
     */
    @Override
    public List<SysSwclbagsInformation> selectSysSwclbagsInformationList(SysSwclbagsInformation sysSwclbagsInformation)
    {
        return sysSwclbagsInformationMapper.selectSysSwclbagsInformationList(sysSwclbagsInformation);
    }

    /**
     * 新增涉外车辆备案公司认证
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 结果
     */
    @Override
    public int insertSysSwclbagsInformation(SysSwclbagsInformation sysSwclbagsInformation)
    {
        return sysSwclbagsInformationMapper.insertSysSwclbagsInformation(sysSwclbagsInformation);
    }

    /**
     * 修改涉外车辆备案公司认证
     * 
     * @param sysSwclbagsInformation 涉外车辆备案公司认证
     * @return 结果
     */
    @Override
    public int updateSysSwclbagsInformation(SysSwclbagsInformation sysSwclbagsInformation)
    {
        return sysSwclbagsInformationMapper.updateSysSwclbagsInformation(sysSwclbagsInformation);
    }

    /**
     * 批量删除涉外车辆备案公司认证
     * 
     * @param countryGss 需要删除的涉外车辆备案公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysSwclbagsInformationByCountryGss(String[] countryGss)
    {
        return sysSwclbagsInformationMapper.deleteSysSwclbagsInformationByCountryGss(countryGss);
    }

    /**
     * 删除涉外车辆备案公司认证信息
     * 
     * @param countryGs 涉外车辆备案公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysSwclbagsInformationByCountryGs(String countryGs)
    {
        return sysSwclbagsInformationMapper.deleteSysSwclbagsInformationByCountryGs(countryGs);
    }
}

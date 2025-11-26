package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysJkgwgsInformationMapper;
import com.ruoyi.system.domain.SysJkgwgsInformation;
import com.ruoyi.system.service.ISysJkgwgsInformationService;

/**
 * 进口关务公司认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysJkgwgsInformationServiceImpl implements ISysJkgwgsInformationService 
{
    @Autowired
    private SysJkgwgsInformationMapper sysJkgwgsInformationMapper;

    /**
     * 查询进口关务公司认证
     * 
     * @param countryGs 进口关务公司认证主键
     * @return 进口关务公司认证
     */
    @Override
    public SysJkgwgsInformation selectSysJkgwgsInformationByCountryGs(String countryGs)
    {
        return sysJkgwgsInformationMapper.selectSysJkgwgsInformationByCountryGs(countryGs);
    }

    /**
     * 查询进口关务公司认证列表
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 进口关务公司认证
     */
    @Override
    public List<SysJkgwgsInformation> selectSysJkgwgsInformationList(SysJkgwgsInformation sysJkgwgsInformation)
    {
        return sysJkgwgsInformationMapper.selectSysJkgwgsInformationList(sysJkgwgsInformation);
    }

    /**
     * 新增进口关务公司认证
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 结果
     */
    @Override
    public int insertSysJkgwgsInformation(SysJkgwgsInformation sysJkgwgsInformation)
    {
        return sysJkgwgsInformationMapper.insertSysJkgwgsInformation(sysJkgwgsInformation);
    }

    /**
     * 修改进口关务公司认证
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 结果
     */
    @Override
    public int updateSysJkgwgsInformation(SysJkgwgsInformation sysJkgwgsInformation)
    {
        return sysJkgwgsInformationMapper.updateSysJkgwgsInformation(sysJkgwgsInformation);
    }

    /**
     * 批量删除进口关务公司认证
     * 
     * @param countryGss 需要删除的进口关务公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysJkgwgsInformationByCountryGss(String[] countryGss)
    {
        return sysJkgwgsInformationMapper.deleteSysJkgwgsInformationByCountryGss(countryGss);
    }

    /**
     * 删除进口关务公司认证信息
     * 
     * @param countryGs 进口关务公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysJkgwgsInformationByCountryGs(String countryGs)
    {
        return sysJkgwgsInformationMapper.deleteSysJkgwgsInformationByCountryGs(countryGs);
    }
}

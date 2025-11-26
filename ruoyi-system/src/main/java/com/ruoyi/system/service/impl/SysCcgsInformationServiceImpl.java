package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCcgsInformationMapper;
import com.ruoyi.system.domain.SysCcgsInformation;
import com.ruoyi.system.service.ISysCcgsInformationService;

/**
 * 仓储公司认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCcgsInformationServiceImpl implements ISysCcgsInformationService 
{
    @Autowired
    private SysCcgsInformationMapper sysCcgsInformationMapper;

    /**
     * 查询仓储公司认证
     * 
     * @param countryGs 仓储公司认证主键
     * @return 仓储公司认证
     */
    @Override
    public SysCcgsInformation selectSysCcgsInformationByCountryGs(String countryGs)
    {
        return sysCcgsInformationMapper.selectSysCcgsInformationByCountryGs(countryGs);
    }

    /**
     * 查询仓储公司认证列表
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 仓储公司认证
     */
    @Override
    public List<SysCcgsInformation> selectSysCcgsInformationList(SysCcgsInformation sysCcgsInformation)
    {
        return sysCcgsInformationMapper.selectSysCcgsInformationList(sysCcgsInformation);
    }

    /**
     * 新增仓储公司认证
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 结果
     */
    @Override
    public int insertSysCcgsInformation(SysCcgsInformation sysCcgsInformation)
    {
        return sysCcgsInformationMapper.insertSysCcgsInformation(sysCcgsInformation);
    }

    /**
     * 修改仓储公司认证
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 结果
     */
    @Override
    public int updateSysCcgsInformation(SysCcgsInformation sysCcgsInformation)
    {
        return sysCcgsInformationMapper.updateSysCcgsInformation(sysCcgsInformation);
    }

    /**
     * 批量删除仓储公司认证
     * 
     * @param countryGss 需要删除的仓储公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCcgsInformationByCountryGss(String[] countryGss)
    {
        return sysCcgsInformationMapper.deleteSysCcgsInformationByCountryGss(countryGss);
    }

    /**
     * 删除仓储公司认证信息
     * 
     * @param countryGs 仓储公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCcgsInformationByCountryGs(String countryGs)
    {
        return sysCcgsInformationMapper.deleteSysCcgsInformationByCountryGs(countryGs);
    }
}

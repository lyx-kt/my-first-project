package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCkgwgsInformationMapper;
import com.ruoyi.system.domain.SysCkgwgsInformation;
import com.ruoyi.system.service.ISysCkgwgsInformationService;

/**
 * 出口关务公司认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCkgwgsInformationServiceImpl implements ISysCkgwgsInformationService 
{
    @Autowired
    private SysCkgwgsInformationMapper sysCkgwgsInformationMapper;

    /**
     * 查询出口关务公司认证
     * 
     * @param countryGs 出口关务公司认证主键
     * @return 出口关务公司认证
     */
    @Override
    public SysCkgwgsInformation selectSysCkgwgsInformationByCountryGs(String countryGs)
    {
        return sysCkgwgsInformationMapper.selectSysCkgwgsInformationByCountryGs(countryGs);
    }

    /**
     * 查询出口关务公司认证列表
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 出口关务公司认证
     */
    @Override
    public List<SysCkgwgsInformation> selectSysCkgwgsInformationList(SysCkgwgsInformation sysCkgwgsInformation)
    {
        return sysCkgwgsInformationMapper.selectSysCkgwgsInformationList(sysCkgwgsInformation);
    }

    /**
     * 新增出口关务公司认证
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 结果
     */
    @Override
    public int insertSysCkgwgsInformation(SysCkgwgsInformation sysCkgwgsInformation)
    {
        return sysCkgwgsInformationMapper.insertSysCkgwgsInformation(sysCkgwgsInformation);
    }

    /**
     * 修改出口关务公司认证
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 结果
     */
    @Override
    public int updateSysCkgwgsInformation(SysCkgwgsInformation sysCkgwgsInformation)
    {
        return sysCkgwgsInformationMapper.updateSysCkgwgsInformation(sysCkgwgsInformation);
    }

    /**
     * 批量删除出口关务公司认证
     * 
     * @param countryGss 需要删除的出口关务公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCkgwgsInformationByCountryGss(String[] countryGss)
    {
        return sysCkgwgsInformationMapper.deleteSysCkgwgsInformationByCountryGss(countryGss);
    }

    /**
     * 删除出口关务公司认证信息
     * 
     * @param countryGs 出口关务公司认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCkgwgsInformationByCountryGs(String countryGs)
    {
        return sysCkgwgsInformationMapper.deleteSysCkgwgsInformationByCountryGs(countryGs);
    }
}

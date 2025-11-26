package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCyrjgInformationMapper;
import com.ruoyi.system.domain.SysCyrjgInformation;
import com.ruoyi.system.service.ISysCyrjgInformationService;

/**
 * 承运人机构认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCyrjgInformationServiceImpl implements ISysCyrjgInformationService 
{
    @Autowired
    private SysCyrjgInformationMapper sysCyrjgInformationMapper;

    /**
     * 查询承运人机构认证
     * 
     * @param countryGs 承运人机构认证主键
     * @return 承运人机构认证
     */
    @Override
    public SysCyrjgInformation selectSysCyrjgInformationByCountryGs(String countryGs)
    {
        return sysCyrjgInformationMapper.selectSysCyrjgInformationByCountryGs(countryGs);
    }

    /**
     * 查询承运人机构认证列表
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 承运人机构认证
     */
    @Override
    public List<SysCyrjgInformation> selectSysCyrjgInformationList(SysCyrjgInformation sysCyrjgInformation)
    {
        return sysCyrjgInformationMapper.selectSysCyrjgInformationList(sysCyrjgInformation);
    }

    /**
     * 新增承运人机构认证
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 结果
     */
    @Override
    public int insertSysCyrjgInformation(SysCyrjgInformation sysCyrjgInformation)
    {
        return sysCyrjgInformationMapper.insertSysCyrjgInformation(sysCyrjgInformation);
    }

    /**
     * 修改承运人机构认证
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 结果
     */
    @Override
    public int updateSysCyrjgInformation(SysCyrjgInformation sysCyrjgInformation)
    {
        return sysCyrjgInformationMapper.updateSysCyrjgInformation(sysCyrjgInformation);
    }

    /**
     * 批量删除承运人机构认证
     * 
     * @param countryGss 需要删除的承运人机构认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCyrjgInformationByCountryGss(String[] countryGss)
    {
        return sysCyrjgInformationMapper.deleteSysCyrjgInformationByCountryGss(countryGss);
    }

    /**
     * 删除承运人机构认证信息
     * 
     * @param countryGs 承运人机构认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCyrjgInformationByCountryGs(String countryGs)
    {
        return sysCyrjgInformationMapper.deleteSysCyrjgInformationByCountryGs(countryGs);
    }
}

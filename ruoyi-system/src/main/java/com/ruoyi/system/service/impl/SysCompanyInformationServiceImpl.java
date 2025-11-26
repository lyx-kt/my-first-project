package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCompanyInformationMapper;
import com.ruoyi.system.domain.SysCompanyInformation;
import com.ruoyi.system.service.ISysCompanyInformationService;

/**
 * 关务公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCompanyInformationServiceImpl implements ISysCompanyInformationService 
{
    @Autowired
    private SysCompanyInformationMapper sysCompanyInformationMapper;

    /**
     * 查询关务公司
     * 
     * @param companyName 关务公司主键
     * @return 关务公司
     */
    @Override
    public SysCompanyInformation selectSysCompanyInformationByCompanyName(String companyName)
    {
        return sysCompanyInformationMapper.selectSysCompanyInformationByCompanyName(companyName);
    }

    /**
     * 查询关务公司列表
     * 
     * @param sysCompanyInformation 关务公司
     * @return 关务公司
     */
    @Override
    public List<SysCompanyInformation> selectSysCompanyInformationList(SysCompanyInformation sysCompanyInformation)
    {
        return sysCompanyInformationMapper.selectSysCompanyInformationList(sysCompanyInformation);
    }

    /**
     * 新增关务公司
     * 
     * @param sysCompanyInformation 关务公司
     * @return 结果
     */
    @Override
    public int insertSysCompanyInformation(SysCompanyInformation sysCompanyInformation)
    {
        sysCompanyInformation.setCreateTime(DateUtils.getNowDate());
        return sysCompanyInformationMapper.insertSysCompanyInformation(sysCompanyInformation);
    }

    /**
     * 修改关务公司
     * 
     * @param sysCompanyInformation 关务公司
     * @return 结果
     */
    @Override
    public int updateSysCompanyInformation(SysCompanyInformation sysCompanyInformation)
    {
        return sysCompanyInformationMapper.updateSysCompanyInformation(sysCompanyInformation);
    }

    /**
     * 批量删除关务公司
     * 
     * @param companyNames 需要删除的关务公司主键
     * @return 结果
     */
    @Override
    public int deleteSysCompanyInformationByCompanyNames(String[] companyNames)
    {
        return sysCompanyInformationMapper.deleteSysCompanyInformationByCompanyNames(companyNames);
    }

    /**
     * 删除关务公司信息
     * 
     * @param companyName 关务公司主键
     * @return 结果
     */
    @Override
    public int deleteSysCompanyInformationByCompanyName(String companyName)
    {
        return sysCompanyInformationMapper.deleteSysCompanyInformationByCompanyName(companyName);
    }
}

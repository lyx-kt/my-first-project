package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysEditInformationMapper;
import com.ruoyi.system.domain.SysEditInformation;
import com.ruoyi.system.service.ISysEditInformationService;

/**
 * 修改信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysEditInformationServiceImpl implements ISysEditInformationService 
{
    @Autowired
    private SysEditInformationMapper sysEditInformationMapper;

    /**
     * 查询修改信息
     * 
     * @param countryId 修改信息主键
     * @return 修改信息
     */
    @Override
    public SysEditInformation selectSysEditInformationByCountryId(String countryId)
    {
        return sysEditInformationMapper.selectSysEditInformationByCountryId(countryId);
    }

    /**
     * 查询修改信息列表
     * 
     * @param sysEditInformation 修改信息
     * @return 修改信息
     */
    @Override
    public List<SysEditInformation> selectSysEditInformationList(SysEditInformation sysEditInformation)
    {
        return sysEditInformationMapper.selectSysEditInformationList(sysEditInformation);
    }

    /**
     * 新增修改信息
     * 
     * @param sysEditInformation 修改信息
     * @return 结果
     */
    @Override
    public int insertSysEditInformation(SysEditInformation sysEditInformation)
    {
        sysEditInformation.setCreateTime(DateUtils.getNowDate());
        return sysEditInformationMapper.insertSysEditInformation(sysEditInformation);
    }

    /**
     * 修改修改信息
     * 
     * @param sysEditInformation 修改信息
     * @return 结果
     */
    @Override
    public int updateSysEditInformation(SysEditInformation sysEditInformation)
    {
        return sysEditInformationMapper.updateSysEditInformation(sysEditInformation);
    }

    /**
     * 批量删除修改信息
     * 
     * @param countryIds 需要删除的修改信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEditInformationByCountryIds(String[] countryIds)
    {
        return sysEditInformationMapper.deleteSysEditInformationByCountryIds(countryIds);
    }

    /**
     * 删除修改信息信息
     * 
     * @param countryId 修改信息主键
     * @return 结果
     */
    @Override
    public int deleteSysEditInformationByCountryId(String countryId)
    {
        return sysEditInformationMapper.deleteSysEditInformationByCountryId(countryId);
    }
}

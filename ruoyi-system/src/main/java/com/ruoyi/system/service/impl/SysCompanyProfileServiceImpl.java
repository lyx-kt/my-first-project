package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCompanyProfileMapper;
import com.ruoyi.system.domain.SysCompanyProfile;
import com.ruoyi.system.service.ISysCompanyProfileService;

/**
 * 企业信息简介价格清单Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-14
 */
@Service
public class SysCompanyProfileServiceImpl implements ISysCompanyProfileService 
{
    @Autowired
    private SysCompanyProfileMapper sysCompanyProfileMapper;

    /**
     * 查询企业信息简介价格清单
     * 
     * @param companyProfile 企业信息简介价格清单主键
     * @return 企业信息简介价格清单
     */
    @Override
    public SysCompanyProfile selectSysCompanyProfileByCompanyProfile(String companyProfile)
    {
        return sysCompanyProfileMapper.selectSysCompanyProfileByCompanyProfile(companyProfile);
    }

    /**
     * 查询企业信息简介价格清单列表
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 企业信息简介价格清单
     */
    @Override
    public List<SysCompanyProfile> selectSysCompanyProfileList(SysCompanyProfile sysCompanyProfile)
    {
        return sysCompanyProfileMapper.selectSysCompanyProfileList(sysCompanyProfile);
    }

    /**
     * 新增企业信息简介价格清单
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 结果
     */
    @Override
    public int insertSysCompanyProfile(SysCompanyProfile sysCompanyProfile)
    {
        sysCompanyProfile.setCreateTime(DateUtils.getNowDate());
        return sysCompanyProfileMapper.insertSysCompanyProfile(sysCompanyProfile);
    }

    /**
     * 修改企业信息简介价格清单
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 结果
     */
    @Override
    public int updateSysCompanyProfile(SysCompanyProfile sysCompanyProfile)
    {
        return sysCompanyProfileMapper.updateSysCompanyProfile(sysCompanyProfile);
    }

    /**
     * 批量删除企业信息简介价格清单
     * 
     * @param companyProfiles 需要删除的企业信息简介价格清单主键
     * @return 结果
     */
    @Override
    public int deleteSysCompanyProfileByCompanyProfiles(String[] companyProfiles)
    {
        return sysCompanyProfileMapper.deleteSysCompanyProfileByCompanyProfiles(companyProfiles);
    }

    /**
     * 删除企业信息简介价格清单信息
     * 
     * @param companyProfile 企业信息简介价格清单主键
     * @return 结果
     */
    @Override
    public int deleteSysCompanyProfileByCompanyProfile(String companyProfile)
    {
        return sysCompanyProfileMapper.deleteSysCompanyProfileByCompanyProfile(companyProfile);
    }
}

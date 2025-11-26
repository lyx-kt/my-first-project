package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysCompanyProfile;

/**
 * 企业信息简介价格清单Service接口
 * 
 * @author ruoyi
 * @date 2025-11-14
 */
public interface ISysCompanyProfileService 
{
    /**
     * 查询企业信息简介价格清单
     * 
     * @param companyProfile 企业信息简介价格清单主键
     * @return 企业信息简介价格清单
     */
    public SysCompanyProfile selectSysCompanyProfileByCompanyProfile(String companyProfile);

    /**
     * 查询企业信息简介价格清单列表
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 企业信息简介价格清单集合
     */
    public List<SysCompanyProfile> selectSysCompanyProfileList(SysCompanyProfile sysCompanyProfile);

    /**
     * 新增企业信息简介价格清单
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 结果
     */
    public int insertSysCompanyProfile(SysCompanyProfile sysCompanyProfile);

    /**
     * 修改企业信息简介价格清单
     * 
     * @param sysCompanyProfile 企业信息简介价格清单
     * @return 结果
     */
    public int updateSysCompanyProfile(SysCompanyProfile sysCompanyProfile);

    /**
     * 批量删除企业信息简介价格清单
     * 
     * @param companyProfiles 需要删除的企业信息简介价格清单主键集合
     * @return 结果
     */
    public int deleteSysCompanyProfileByCompanyProfiles(String[] companyProfiles);

    /**
     * 删除企业信息简介价格清单信息
     * 
     * @param companyProfile 企业信息简介价格清单主键
     * @return 结果
     */
    public int deleteSysCompanyProfileByCompanyProfile(String companyProfile);
}

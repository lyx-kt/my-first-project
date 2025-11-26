package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCompanyInformation;

/**
 * 关务公司Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCompanyInformationMapper 
{
    /**
     * 查询关务公司
     * 
     * @param companyName 关务公司主键
     * @return 关务公司
     */
    public SysCompanyInformation selectSysCompanyInformationByCompanyName(String companyName);

    /**
     * 查询关务公司列表
     * 
     * @param sysCompanyInformation 关务公司
     * @return 关务公司集合
     */
    public List<SysCompanyInformation> selectSysCompanyInformationList(SysCompanyInformation sysCompanyInformation);

    /**
     * 新增关务公司
     * 
     * @param sysCompanyInformation 关务公司
     * @return 结果
     */
    public int insertSysCompanyInformation(SysCompanyInformation sysCompanyInformation);

    /**
     * 修改关务公司
     * 
     * @param sysCompanyInformation 关务公司
     * @return 结果
     */
    public int updateSysCompanyInformation(SysCompanyInformation sysCompanyInformation);

    /**
     * 删除关务公司
     * 
     * @param companyName 关务公司主键
     * @return 结果
     */
    public int deleteSysCompanyInformationByCompanyName(String companyName);

    /**
     * 批量删除关务公司
     * 
     * @param companyNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCompanyInformationByCompanyNames(String[] companyNames);
}

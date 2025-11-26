package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCcgsInformation;

/**
 * 仓储公司认证Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCcgsInformationMapper 
{
    /**
     * 查询仓储公司认证
     * 
     * @param countryGs 仓储公司认证主键
     * @return 仓储公司认证
     */
    public SysCcgsInformation selectSysCcgsInformationByCountryGs(String countryGs);

    /**
     * 查询仓储公司认证列表
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 仓储公司认证集合
     */
    public List<SysCcgsInformation> selectSysCcgsInformationList(SysCcgsInformation sysCcgsInformation);

    /**
     * 新增仓储公司认证
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 结果
     */
    public int insertSysCcgsInformation(SysCcgsInformation sysCcgsInformation);

    /**
     * 修改仓储公司认证
     * 
     * @param sysCcgsInformation 仓储公司认证
     * @return 结果
     */
    public int updateSysCcgsInformation(SysCcgsInformation sysCcgsInformation);

    /**
     * 删除仓储公司认证
     * 
     * @param countryGs 仓储公司认证主键
     * @return 结果
     */
    public int deleteSysCcgsInformationByCountryGs(String countryGs);

    /**
     * 批量删除仓储公司认证
     * 
     * @param countryGss 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCcgsInformationByCountryGss(String[] countryGss);
}

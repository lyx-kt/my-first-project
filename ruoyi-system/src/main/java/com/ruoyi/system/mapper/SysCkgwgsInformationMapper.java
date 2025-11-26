package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCkgwgsInformation;

/**
 * 出口关务公司认证Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCkgwgsInformationMapper 
{
    /**
     * 查询出口关务公司认证
     * 
     * @param countryGs 出口关务公司认证主键
     * @return 出口关务公司认证
     */
    public SysCkgwgsInformation selectSysCkgwgsInformationByCountryGs(String countryGs);

    /**
     * 查询出口关务公司认证列表
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 出口关务公司认证集合
     */
    public List<SysCkgwgsInformation> selectSysCkgwgsInformationList(SysCkgwgsInformation sysCkgwgsInformation);

    /**
     * 新增出口关务公司认证
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 结果
     */
    public int insertSysCkgwgsInformation(SysCkgwgsInformation sysCkgwgsInformation);

    /**
     * 修改出口关务公司认证
     * 
     * @param sysCkgwgsInformation 出口关务公司认证
     * @return 结果
     */
    public int updateSysCkgwgsInformation(SysCkgwgsInformation sysCkgwgsInformation);

    /**
     * 删除出口关务公司认证
     * 
     * @param countryGs 出口关务公司认证主键
     * @return 结果
     */
    public int deleteSysCkgwgsInformationByCountryGs(String countryGs);

    /**
     * 批量删除出口关务公司认证
     * 
     * @param countryGss 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCkgwgsInformationByCountryGss(String[] countryGss);
}

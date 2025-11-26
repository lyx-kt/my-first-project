package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysJkgwgsInformation;

/**
 * 进口关务公司认证Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysJkgwgsInformationService 
{
    /**
     * 查询进口关务公司认证
     * 
     * @param countryGs 进口关务公司认证主键
     * @return 进口关务公司认证
     */
    public SysJkgwgsInformation selectSysJkgwgsInformationByCountryGs(String countryGs);

    /**
     * 查询进口关务公司认证列表
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 进口关务公司认证集合
     */
    public List<SysJkgwgsInformation> selectSysJkgwgsInformationList(SysJkgwgsInformation sysJkgwgsInformation);

    /**
     * 新增进口关务公司认证
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 结果
     */
    public int insertSysJkgwgsInformation(SysJkgwgsInformation sysJkgwgsInformation);

    /**
     * 修改进口关务公司认证
     * 
     * @param sysJkgwgsInformation 进口关务公司认证
     * @return 结果
     */
    public int updateSysJkgwgsInformation(SysJkgwgsInformation sysJkgwgsInformation);

    /**
     * 批量删除进口关务公司认证
     * 
     * @param countryGss 需要删除的进口关务公司认证主键集合
     * @return 结果
     */
    public int deleteSysJkgwgsInformationByCountryGss(String[] countryGss);

    /**
     * 删除进口关务公司认证信息
     * 
     * @param countryGs 进口关务公司认证主键
     * @return 结果
     */
    public int deleteSysJkgwgsInformationByCountryGs(String countryGs);
}

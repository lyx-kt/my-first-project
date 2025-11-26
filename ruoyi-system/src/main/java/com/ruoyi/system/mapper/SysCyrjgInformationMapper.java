package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCyrjgInformation;

/**
 * 承运人机构认证Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCyrjgInformationMapper 
{
    /**
     * 查询承运人机构认证
     * 
     * @param countryGs 承运人机构认证主键
     * @return 承运人机构认证
     */
    public SysCyrjgInformation selectSysCyrjgInformationByCountryGs(String countryGs);

    /**
     * 查询承运人机构认证列表
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 承运人机构认证集合
     */
    public List<SysCyrjgInformation> selectSysCyrjgInformationList(SysCyrjgInformation sysCyrjgInformation);

    /**
     * 新增承运人机构认证
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 结果
     */
    public int insertSysCyrjgInformation(SysCyrjgInformation sysCyrjgInformation);

    /**
     * 修改承运人机构认证
     * 
     * @param sysCyrjgInformation 承运人机构认证
     * @return 结果
     */
    public int updateSysCyrjgInformation(SysCyrjgInformation sysCyrjgInformation);

    /**
     * 删除承运人机构认证
     * 
     * @param countryGs 承运人机构认证主键
     * @return 结果
     */
    public int deleteSysCyrjgInformationByCountryGs(String countryGs);

    /**
     * 批量删除承运人机构认证
     * 
     * @param countryGss 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCyrjgInformationByCountryGss(String[] countryGss);
}

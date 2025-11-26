package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysEditInformation;

/**
 * 修改信息Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysEditInformationService 
{
    /**
     * 查询修改信息
     * 
     * @param countryId 修改信息主键
     * @return 修改信息
     */
    public SysEditInformation selectSysEditInformationByCountryId(String countryId);

    /**
     * 查询修改信息列表
     * 
     * @param sysEditInformation 修改信息
     * @return 修改信息集合
     */
    public List<SysEditInformation> selectSysEditInformationList(SysEditInformation sysEditInformation);

    /**
     * 新增修改信息
     * 
     * @param sysEditInformation 修改信息
     * @return 结果
     */
    public int insertSysEditInformation(SysEditInformation sysEditInformation);

    /**
     * 修改修改信息
     * 
     * @param sysEditInformation 修改信息
     * @return 结果
     */
    public int updateSysEditInformation(SysEditInformation sysEditInformation);

    /**
     * 批量删除修改信息
     * 
     * @param countryIds 需要删除的修改信息主键集合
     * @return 结果
     */
    public int deleteSysEditInformationByCountryIds(String[] countryIds);

    /**
     * 删除修改信息信息
     * 
     * @param countryId 修改信息主键
     * @return 结果
     */
    public int deleteSysEditInformationByCountryId(String countryId);
}

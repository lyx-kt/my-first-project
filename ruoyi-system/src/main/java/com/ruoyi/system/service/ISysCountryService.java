package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysCountry;
import java.util.List;
import java.util.Map;

/**
 * 国家地区Service接口
 * 
 * @author ruoyi
 */
public interface ISysCountryService
{
    /**
     * 查询所有国家地区（按洲分组）
     * 
     * @return 国家地区列表
     */
    Map<String, List<SysCountry>> selectCountryGroupByContinent();

    /**
     * 根据国家代码查询国家信息
     * 
     * @param countryCode 国家代码
     * @return 国家信息
     */
    SysCountry selectCountryByCode(String countryCode);

    /**
     * 查询所有启用的国家列表
     * 
     * @return 国家列表
     */
    List<SysCountry> selectCountryList();
}

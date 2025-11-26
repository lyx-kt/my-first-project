package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国家地区对象 sys_country
 * 
 * @author ruoyi
 */
public class SysCountry extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家ID */
    private Long countryId;

    /** 国家名称（中文） */
    private String countryName;

    /** 国家名称（英文） */
    private String countryNameEn;

    /** 国家代码（ISO 3166-1 alpha-2） */
    private String countryCode;

    /** 电话区号 */
    private String phoneCode;

    /** 所属洲 */
    private String continent;

    /** 排序 */
    private Integer orderNum;

    /** 状态（0正常 1停用） */
    private String status;

    public Long getCountryId()
    {
        return countryId;
    }

    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getCountryNameEn()
    {
        return countryNameEn;
    }

    public void setCountryNameEn(String countryNameEn)
    {
        this.countryNameEn = countryNameEn;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }

    public String getPhoneCode()
    {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode)
    {
        this.phoneCode = phoneCode;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public Integer getOrderNum()
    {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum)
    {
        this.orderNum = orderNum;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}

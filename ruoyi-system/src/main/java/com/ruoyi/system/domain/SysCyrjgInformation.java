package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 承运人机构认证对象 sys_cyrjg_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCyrjgInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家 */
    private String countryGs;

    /** 口岸 */
    @Excel(name = "口岸")
    private String kouan;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String comapnyName;

    /** 公司代码 */
    @Excel(name = "公司代码")
    private String compamyNumber;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String companyAddress;

    /** 服务商品类型 */
    private String fwspGoodType;

    /** 法人姓名 */
    @Excel(name = "法人姓名")
    private String frName;

    /** 法人电话 */
    @Excel(name = "法人电话")
    private String frNumber;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String lxrName;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String lxrNumber;

    /** 公司证照照片 */
    @Excel(name = "公司证照照片")
    private String cpmpanyPicture;

    public void setCountryGs(String countryGs) 
    {
        this.countryGs = countryGs;
    }

    public String getCountryGs() 
    {
        return countryGs;
    }

    public void setKouan(String kouan) 
    {
        this.kouan = kouan;
    }

    public String getKouan() 
    {
        return kouan;
    }

    public void setComapnyName(String comapnyName) 
    {
        this.comapnyName = comapnyName;
    }

    public String getComapnyName() 
    {
        return comapnyName;
    }

    public void setCompamyNumber(String compamyNumber) 
    {
        this.compamyNumber = compamyNumber;
    }

    public String getCompamyNumber() 
    {
        return compamyNumber;
    }

    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() 
    {
        return companyAddress;
    }

    public void setFwspGoodType(String fwspGoodType) 
    {
        this.fwspGoodType = fwspGoodType;
    }

    public String getFwspGoodType() 
    {
        return fwspGoodType;
    }

    public void setFrName(String frName) 
    {
        this.frName = frName;
    }

    public String getFrName() 
    {
        return frName;
    }

    public void setFrNumber(String frNumber) 
    {
        this.frNumber = frNumber;
    }

    public String getFrNumber() 
    {
        return frNumber;
    }

    public void setLxrName(String lxrName) 
    {
        this.lxrName = lxrName;
    }

    public String getLxrName() 
    {
        return lxrName;
    }

    public void setLxrNumber(String lxrNumber) 
    {
        this.lxrNumber = lxrNumber;
    }

    public String getLxrNumber() 
    {
        return lxrNumber;
    }

    public void setCpmpanyPicture(String cpmpanyPicture) 
    {
        this.cpmpanyPicture = cpmpanyPicture;
    }

    public String getCpmpanyPicture() 
    {
        return cpmpanyPicture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("countryGs", getCountryGs())
            .append("kouan", getKouan())
            .append("comapnyName", getComapnyName())
            .append("compamyNumber", getCompamyNumber())
            .append("companyAddress", getCompanyAddress())
            .append("fwspGoodType", getFwspGoodType())
            .append("frName", getFrName())
            .append("frNumber", getFrNumber())
            .append("lxrName", getLxrName())
            .append("lxrNumber", getLxrNumber())
            .append("cpmpanyPicture", getCpmpanyPicture())
            .toString();
    }
}

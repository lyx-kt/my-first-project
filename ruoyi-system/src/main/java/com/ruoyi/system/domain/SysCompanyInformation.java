package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 关务公司对象 sys_company_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCompanyInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公司名称
 */
    private String companyName;

    /** 公司简介 */
    @Excel(name = "公司简介")
    private String companyProfile;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String companyAddress;

    /** 口岸
 */
    @Excel(name = "口岸 ")
    private String PortContact;

    /** 企业代码 */
    @Excel(name = "企业代码")
    private String companyCode;

    /** 联系人姓名
 */
    @Excel(name = "联系人姓名 ")
    private String PersonName;

    /** 联系人电话
 */
    @Excel(name = "联系人电话 ")
    private Long personPhone;

    /** 公司证件照
 */
    @Excel(name = "公司证件照 ")
    private String CompanyIDPhotos;

    /** 服务项目及收费标准 */
    @Excel(name = "服务项目及收费标准")
    private String ServiceItemsandFeeStandards;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }

    public void setCompanyProfile(String companyProfile) 
    {
        this.companyProfile = companyProfile;
    }

    public String getCompanyProfile() 
    {
        return companyProfile;
    }

    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() 
    {
        return companyAddress;
    }

    public void setPortContact(String PortContact) 
    {
        this.PortContact = PortContact;
    }

    public String getPortContact() 
    {
        return PortContact;
    }

    public void setCompanyCode(String companyCode) 
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode() 
    {
        return companyCode;
    }

    public void setPersonName(String PersonName)
    {
        this.PersonName = PersonName;
    }

    public String getPersonName()
    {
        return PersonName;
    }

    public void setPersonPhone(Long personPhone) 
    {
        this.personPhone = personPhone;
    }

    public Long getPersonPhone() 
    {
        return personPhone;
    }

    public void setCompanyIDPhotos(String CompanyIDPhotos)
    {
        this.CompanyIDPhotos = CompanyIDPhotos;
    }

    public String getCompanyIDPhotos()
    {
        return CompanyIDPhotos;
    }

    public void setServiceItemsandFeeStandards(String ServiceItemsandFeeStandards)
    {
        this.ServiceItemsandFeeStandards = ServiceItemsandFeeStandards;
    }

    public String getServiceItemsandFeeStandards()
    {
        return ServiceItemsandFeeStandards;
    }

    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("companyName", getCompanyName())
            .append("companyProfile", getCompanyProfile())
            .append("companyAddress", getCompanyAddress())
            .append("PortContact", getPortContact())
            .append("companyCode", getCompanyCode())
            .append("PersonName", getPersonName())
            .append("personPhone", getPersonPhone())
            .append("CompanyIDPhotos", getCompanyIDPhotos())
            .append("ServiceItemsandFeeStandards", getServiceItemsandFeeStandards())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

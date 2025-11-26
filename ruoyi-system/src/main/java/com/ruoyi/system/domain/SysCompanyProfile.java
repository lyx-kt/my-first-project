package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 企业信息简介价格清单对象 sys_company_profile
 * 
 * @author ruoyi
 * @date 2025-11-14
 */
public class SysCompanyProfile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 企业简介 */
    private String companyProfile;

    /** 企业展示图 图片上传 */
    @Excel(name = "企业展示图 图片上传")
    private String companyPictureUpload;

    /** 服务项目及收费标准 */
    @Excel(name = "服务项目及收费标准")
    private String serviceItemStandardBz;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setCompanyProfile(String companyProfile) 
    {
        this.companyProfile = companyProfile;
    }

    public String getCompanyProfile() 
    {
        return companyProfile;
    }

    public void setCompanyPictureUpload(String companyPictureUpload) 
    {
        this.companyPictureUpload = companyPictureUpload;
    }

    public String getCompanyPictureUpload() 
    {
        return companyPictureUpload;
    }

    public void setServiceItemStandardBz(String serviceItemStandardBz) 
    {
        this.serviceItemStandardBz = serviceItemStandardBz;
    }

    public String getServiceItemStandardBz() 
    {
        return serviceItemStandardBz;
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
            .append("companyProfile", getCompanyProfile())
            .append("companyPictureUpload", getCompanyPictureUpload())
            .append("serviceItemStandardBz", getServiceItemStandardBz())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

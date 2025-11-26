package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 修改信息对象 sys_edit_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysEditInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家 */
    private String countryId;

    /** 口岸 */
    @Excel(name = "口岸")
    private String exitPort;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String companyName;

    /** 公司代码 */
    @Excel(name = "公司代码")
    private Long companyDaima;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String companyAddress;

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

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setCountryId(String countryId) 
    {
        this.countryId = countryId;
    }

    public String getCountryId() 
    {
        return countryId;
    }

    public void setExitPort(String exitPort) 
    {
        this.exitPort = exitPort;
    }

    public String getExitPort() 
    {
        return exitPort;
    }

    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }

    public void setCompanyDaima(Long companyDaima) 
    {
        this.companyDaima = companyDaima;
    }

    public Long getCompanyDaima() 
    {
        return companyDaima;
    }

    public void setCompanyAddress(String companyAddress) 
    {
        this.companyAddress = companyAddress;
    }

    public String getCompanyAddress() 
    {
        return companyAddress;
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
            .append("countryId", getCountryId())
            .append("exitPort", getExitPort())
            .append("companyName", getCompanyName())
            .append("companyDaima", getCompanyDaima())
            .append("companyAddress", getCompanyAddress())
            .append("frName", getFrName())
            .append("frNumber", getFrNumber())
            .append("lxrName", getLxrName())
            .append("lxrNumber", getLxrNumber())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

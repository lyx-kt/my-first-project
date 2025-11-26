package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 承运人确报对象 sys_customs_declaration
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCustomsDeclaration extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 承运人姓名 */
    private String carrierName;

    /** 承运人境内电话 */
    @Excel(name = "承运人境内电话")
    private String carrierDomesticPhone;

    /** 承运人境外电话 */
    @Excel(name = "承运人境外电话")
    private String carrierOverseasPhone;

    /** 确报类型（空车0、重车1） */
    @Excel(name = "确报类型", readConverterExp = "空=车0、重车1")
    private String confirmedReportType;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String licensePlateNumber;

    /** 备案公司名称 */
    @Excel(name = "备案公司名称")
    private String registeredCompanyName;

    /** 备案公司邮箱
 */
    @Excel(name = "备案公司邮箱 ")
    private String registeredCompanyEmail;

    /** 备案公司电话 */
    @Excel(name = "备案公司电话")
    private String registeredCompanyPhone;

    /** 运通卡 */
    @Excel(name = "运通卡")
    private String americanExpresCard;

    /** 行车证 */
    @Excel(name = "行车证")
    private String vehicleRegistrationCertificate;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setCarrierName(String carrierName) 
    {
        this.carrierName = carrierName;
    }

    public String getCarrierName() 
    {
        return carrierName;
    }

    public void setCarrierDomesticPhone(String carrierDomesticPhone) 
    {
        this.carrierDomesticPhone = carrierDomesticPhone;
    }

    public String getCarrierDomesticPhone() 
    {
        return carrierDomesticPhone;
    }

    public void setCarrierOverseasPhone(String carrierOverseasPhone) 
    {
        this.carrierOverseasPhone = carrierOverseasPhone;
    }

    public String getCarrierOverseasPhone() 
    {
        return carrierOverseasPhone;
    }

    public void setConfirmedReportType(String confirmedReportType) 
    {
        this.confirmedReportType = confirmedReportType;
    }

    public String getConfirmedReportType() 
    {
        return confirmedReportType;
    }

    public void setLicensePlateNumber(String licensePlateNumber) 
    {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateNumber() 
    {
        return licensePlateNumber;
    }

    public void setRegisteredCompanyName(String registeredCompanyName) 
    {
        this.registeredCompanyName = registeredCompanyName;
    }

    public String getRegisteredCompanyName() 
    {
        return registeredCompanyName;
    }

    public void setRegisteredCompanyEmail(String registeredCompanyEmail) 
    {
        this.registeredCompanyEmail = registeredCompanyEmail;
    }

    public String getRegisteredCompanyEmail() 
    {
        return registeredCompanyEmail;
    }

    public void setRegisteredCompanyPhone(String registeredCompanyPhone) 
    {
        this.registeredCompanyPhone = registeredCompanyPhone;
    }

    public String getRegisteredCompanyPhone() 
    {
        return registeredCompanyPhone;
    }

    public void setAmericanExpresCard(String americanExpresCard) 
    {
        this.americanExpresCard = americanExpresCard;
    }

    public String getAmericanExpresCard() 
    {
        return americanExpresCard;
    }

    public void setVehicleRegistrationCertificate(String vehicleRegistrationCertificate) 
    {
        this.vehicleRegistrationCertificate = vehicleRegistrationCertificate;
    }

    public String getVehicleRegistrationCertificate() 
    {
        return vehicleRegistrationCertificate;
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
            .append("carrierName", getCarrierName())
            .append("carrierDomesticPhone", getCarrierDomesticPhone())
            .append("carrierOverseasPhone", getCarrierOverseasPhone())
            .append("confirmedReportType", getConfirmedReportType())
            .append("licensePlateNumber", getLicensePlateNumber())
            .append("registeredCompanyName", getRegisteredCompanyName())
            .append("registeredCompanyEmail", getRegisteredCompanyEmail())
            .append("registeredCompanyPhone", getRegisteredCompanyPhone())
            .append("americanExpresCard", getAmericanExpresCard())
            .append("vehicleRegistrationCertificate", getVehicleRegistrationCertificate())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 【请填写功能名称】对象 sys_vehicle_registration_application
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysVehicleRegistrationApplication extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 承运人姓名
	 */
    private String carrierName;

    /** 承运人境内电话
 */
    @Excel(name = "承运人境内电话 ")
    private Long carrierDomesticPhone;

    /** 承运人境外电话 */
    @Excel(name = "承运人境外电话")
    private Long carrierOverseasPhone;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String confirmedReportType;

    /** 许可证编号 */
    @Excel(name = "许可证编号")
    private String licenseNumber;

    /** 国际汽车运输行车许可证 */
    @Excel(name = "国际汽车运输行车许可证")
    private String internationalPermit;

    /** 车辆照片 */
    @Excel(name = "车辆照片")
    private String vehiclePhoto;

    /** 车辆行驶证（主车0，挂车1） */
    @Excel(name = "车辆行驶证", readConverterExp = "主=车0，挂车1")
    private String vehicleRegistrationCertificate;

    /** 车辆海关注册证 */
    @Excel(name = "车辆海关注册证")
    private String vehicleCustomsRegistrationCertificate;

    /** 驾驶员护照 */
    @Excel(name = "驾驶员护照")
    private String driverPassport;

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

    public void setCarrierDomesticPhone(Long carrierDomesticPhone) 
    {
        this.carrierDomesticPhone = carrierDomesticPhone;
    }

    public Long getCarrierDomesticPhone() 
    {
        return carrierDomesticPhone;
    }

    public void setCarrierOverseasPhone(Long carrierOverseasPhone) 
    {
        this.carrierOverseasPhone = carrierOverseasPhone;
    }

    public Long getCarrierOverseasPhone() 
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

    public void setLicenseNumber(String licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() 
    {
        return licenseNumber;
    }

    public void setInternationalPermit(String internationalPermit)
    {
        this.internationalPermit = internationalPermit;
    }

    public String getInternationalPermit()
    {
        return internationalPermit;
    }

    public void setVehiclePhoto(String vehiclePhoto) 
    {
        this.vehiclePhoto = vehiclePhoto;
    }

    public String getVehiclePhoto() 
    {
        return vehiclePhoto;
    }

    public void setVehicleRegistrationCertificate(String vehicleRegistrationCertificate) 
    {
        this.vehicleRegistrationCertificate = vehicleRegistrationCertificate;
    }

    public String getVehicleRegistrationCertificate() 
    {
        return vehicleRegistrationCertificate;
    }

    public void setVehicleCustomsRegistrationCertificate(String vehicleCustomsRegistrationCertificate) 
    {
        this.vehicleCustomsRegistrationCertificate = vehicleCustomsRegistrationCertificate;
    }

    public String getVehicleCustomsRegistrationCertificate() 
    {
        return vehicleCustomsRegistrationCertificate;
    }

    public void setDriverPassport(String driverPassport) 
    {
        this.driverPassport = driverPassport;
    }

    public String getDriverPassport() 
    {
        return driverPassport;
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
            .append("licenseNumber", getLicenseNumber())
            .append("international Permit", getInternationalPermit())
            .append("vehiclePhoto", getVehiclePhoto())
            .append("vehicleRegistrationCertificate", getVehicleRegistrationCertificate())
            .append("vehicleCustomsRegistrationCertificate", getVehicleCustomsRegistrationCertificate())
            .append("driverPassport", getDriverPassport())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

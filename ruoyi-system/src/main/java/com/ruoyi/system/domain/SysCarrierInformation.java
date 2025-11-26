package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 线路详情对象 sys_carrier_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCarrierInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 承运人姓名
 */
    private String carrierNamecarrier;

    /** 承运人邮箱
 */
    @Excel(name = "承运人邮箱 ")
    private String emailcontactNumber;

    /** 联系电话（中国）
 */
    @Excel(name = "联系电话", readConverterExp = "中=国")
    private Long chinacontactNumber;

    /** 联系电话（本地）
 */
    @Excel(name = "联系电话", readConverterExp = "本=地")
    private Long localdriverPassportvehicle;

    /** 驾驶员护照
 */
    @Excel(name = "驾驶员护照 ")
    private String customsRegistration;

    /** 车辆海关注册证
 */
    @Excel(name = "车辆海关注册证 ")
    private String certificatevehicleRegistration;

    /** 车辆行驶证（主车0，挂车1）
 */
    @Excel(name = "车辆行驶证", readConverterExp = "主=车0，挂车1")
    private String certificate;

    /** 国际汽车运输行车许可证
 */
    @Excel(name = "国际汽车运输行车许可证 ")
    private String internationalMotoVehicleTransport;

    /** 车辆照片
 */
    @Excel(name = "车辆照片 ")
    private String permitvehiclePhotos;

    /** 运通卡 */
    @Excel(name = "运通卡")
    private String photosexpressCard;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setCarrierNamecarrier(String carrierNamecarrier) 
    {
        this.carrierNamecarrier = carrierNamecarrier;
    }

    public String getCarrierNamecarrier() 
    {
        return carrierNamecarrier;
    }

    public void setEmailcontactNumber(String emailcontactNumber) 
    {
        this.emailcontactNumber = emailcontactNumber;
    }

    public String getEmailcontactNumber() 
    {
        return emailcontactNumber;
    }

    public void setChinacontactNumber(Long chinacontactNumber) 
    {
        this.chinacontactNumber = chinacontactNumber;
    }

    public Long getChinacontactNumber() 
    {
        return chinacontactNumber;
    }

    public void setLocaldriverPassportvehicle(Long localdriverPassportvehicle) 
    {
        this.localdriverPassportvehicle = localdriverPassportvehicle;
    }

    public Long getLocaldriverPassportvehicle() 
    {
        return localdriverPassportvehicle;
    }

    public void setCustomsRegistration(String customsRegistration) 
    {
        this.customsRegistration = customsRegistration;
    }

    public String getCustomsRegistration() 
    {
        return customsRegistration;
    }

    public void setCertificatevehicleRegistration(String certificatevehicleRegistration) 
    {
        this.certificatevehicleRegistration = certificatevehicleRegistration;
    }

    public String getCertificatevehicleRegistration() 
    {
        return certificatevehicleRegistration;
    }

    public void setCertificate(String certificate) 
    {
        this.certificate = certificate;
    }

    public String getCertificate() 
    {
        return certificate;
    }

    public void setInternationalMotoVehicleTransport(String internationalMotoVehicleTransport) 
    {
        this.internationalMotoVehicleTransport = internationalMotoVehicleTransport;
    }

    public String getInternationalMotoVehicleTransport() 
    {
        return internationalMotoVehicleTransport;
    }

    public void setPermitvehiclePhotos(String permitvehiclePhotos) 
    {
        this.permitvehiclePhotos = permitvehiclePhotos;
    }

    public String getPermitvehiclePhotos() 
    {
        return permitvehiclePhotos;
    }

    public void setPhotosexpressCard(String photosexpressCard) 
    {
        this.photosexpressCard = photosexpressCard;
    }

    public String getPhotosexpressCard() 
    {
        return photosexpressCard;
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
            .append("carrierNamecarrier", getCarrierNamecarrier())
            .append("emailcontactNumber", getEmailcontactNumber())
            .append("chinacontactNumber", getChinacontactNumber())
            .append("localdriverPassportvehicle", getLocaldriverPassportvehicle())
            .append("customsRegistration", getCustomsRegistration())
            .append("certificatevehicleRegistration", getCertificatevehicleRegistration())
            .append("certificate", getCertificate())
            .append("internationalMotoVehicleTransport", getInternationalMotoVehicleTransport())
            .append("permitvehiclePhotos", getPermitvehiclePhotos())
            .append("photosexpressCard", getPhotosexpressCard())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

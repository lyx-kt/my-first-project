package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 货源大厅对象 sys_carrier_accept_order
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCarrierAcceptOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 货物信息（订单号） */
    private String cargoInformation;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 货物品名 */
    @Excel(name = "货物品名")
    private String NameofGoods;

    /** 货物件数 */
    @Excel(name = "货物件数")
    private Long numberGood;

    /** 始发地址 */
    @Excel(name = "始发地址")
    private String originAddress;

    /** 离境口岸 */
    @Excel(name = "离境口岸")
    private String exitPort;

    /** 卸货地址 */
    @Excel(name = "卸货地址")
    private String deliveryAddress;

    /** 预计到港时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计到港时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date estimatedTime;

    /** 货物重量 */
    @Excel(name = "货物重量")
    private String cargoWeight;

    /** 货物体积 */
    @Excel(name = "货物体积")
    private String cargoVolume;

    /** 包装方式 */
    @Excel(name = "包装方式")
    private String packagingMethod;

    public void setCargoInformation(String cargoInformation) 
    {
        this.cargoInformation = cargoInformation;
    }

    public String getCargoInformation() 
    {
        return cargoInformation;
    }

    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
    }

    public void setNameofGoods(String NameofGoods)
    {
        this.NameofGoods = NameofGoods;
    }

    public String getNameofGoods()
    {
        return NameofGoods;
    }

    public void setNumberGood(Long numberGood) 
    {
        this.numberGood = numberGood;
    }

    public Long getNumberGood() 
    {
        return numberGood;
    }

    public void setOriginAddress(String originAddress) 
    {
        this.originAddress = originAddress;
    }

    public String getOriginAddress() 
    {
        return originAddress;
    }

    public void setExitPort(String exitPort) 
    {
        this.exitPort = exitPort;
    }

    public String getExitPort() 
    {
        return exitPort;
    }

    public void setDeliveryAddress(String deliveryAddress) 
    {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() 
    {
        return deliveryAddress;
    }

    public void setEstimatedTime(Date estimatedTime)
    {
        this.estimatedTime = estimatedTime;
    }

    public Date getEstimatedTime()
    {
        return estimatedTime;
    }

    public void setCargoWeight(String cargoWeight) 
    {
        this.cargoWeight = cargoWeight;
    }

    public String getCargoWeight() 
    {
        return cargoWeight;
    }

    public void setCargoVolume(String cargoVolume) 
    {
        this.cargoVolume = cargoVolume;
    }

    public String getCargoVolume() 
    {
        return cargoVolume;
    }

    public void setPackagingMethod(String packagingMethod) 
    {
        this.packagingMethod = packagingMethod;
    }

    public String getPackagingMethod() 
    {
        return packagingMethod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cargoInformation", getCargoInformation())
            .append("releaseTime", getReleaseTime())
            .append("NameofGoods", getNameofGoods())
            .append("numberGood", getNumberGood())
            .append("originAddress", getOriginAddress())
            .append("exitPort", getExitPort())
            .append("deliveryAddress", getDeliveryAddress())
            .append("estimatedTime", getEstimatedTime())
            .append("cargoWeight", getCargoWeight())
            .append("cargoVolume", getCargoVolume())
            .append("packagingMethod", getPackagingMethod())
            .toString();
    }
}

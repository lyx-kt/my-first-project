package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 线路大厅对象 sys_vehicle_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysVehicleInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 起运地 */
    private String placeOfDeparture;

    /** 目的国 */
    @Excel(name = "目的国")
    private String destinationCountry;

    /** 车型 */
    @Excel(name = "车型")
    private String carModel;

    /** 车牌号（境外车牌号（主车0、挂车1）） */
    @Excel(name = "车牌号", readConverterExp = "境=外车牌号（主车0、挂车1")
    private String licensePlateNumber;

    /** 离境口岸 */
    @Excel(name = "离境口岸")
    private String exitPort;

    /** 车辆状态 */
    @Excel(name = "车辆状态")
    private String vehicleStatus;

    /** 有效装载尺寸 */
    @Excel(name = "有效装载尺寸")
    private String effectiveLoadingDimensions;

    /** 轴数 */
    @Excel(name = "轴数")
    private String numberOfAxles;

    /** 载重kg */
    @Excel(name = "载重kg")
    private Long loadCapacity;

    /** 预估运费$ */
    @Excel(name = "预估运费$")
    private Long estimatedShippingCost;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setPlaceOfDeparture(String placeOfDeparture) 
    {
        this.placeOfDeparture = placeOfDeparture;
    }

    public String getPlaceOfDeparture() 
    {
        return placeOfDeparture;
    }

    public void setDestinationCountry(String destinationCountry) 
    {
        this.destinationCountry = destinationCountry;
    }

    public String getDestinationCountry() 
    {
        return destinationCountry;
    }

    public void setCarModel(String carModel) 
    {
        this.carModel = carModel;
    }

    public String getCarModel() 
    {
        return carModel;
    }

    public void setLicensePlateNumber(String licensePlateNumber) 
    {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateNumber() 
    {
        return licensePlateNumber;
    }

    public void setExitPort(String exitPort) 
    {
        this.exitPort = exitPort;
    }

    public String getExitPort() 
    {
        return exitPort;
    }

    public void setVehicleStatus(String vehicleStatus)
    {
        this.vehicleStatus = vehicleStatus;
    }

    public String getVehicleStatus()
    {
        return vehicleStatus;
    }

    public void setEffectiveLoadingDimensions(String effectiveLoadingDimensions) 
    {
        this.effectiveLoadingDimensions = effectiveLoadingDimensions;
    }

    public String getEffectiveLoadingDimensions() 
    {
        return effectiveLoadingDimensions;
    }

    public void setNumberOfAxles(String numberOfAxles) 
    {
        this.numberOfAxles = numberOfAxles;
    }

    public String getNumberOfAxles() 
    {
        return numberOfAxles;
    }

    public void setLoadCapacity(Long loadCapacity) 
    {
        this.loadCapacity = loadCapacity;
    }

    public Long getLoadCapacity() 
    {
        return loadCapacity;
    }

    public void setEstimatedShippingCost(Long estimatedShippingCost) 
    {
        this.estimatedShippingCost = estimatedShippingCost;
    }

    public Long getEstimatedShippingCost() 
    {
        return estimatedShippingCost;
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
            .append("placeOfDeparture", getPlaceOfDeparture())
            .append("destinationCountry", getDestinationCountry())
            .append("carModel", getCarModel())
            .append("licensePlateNumber", getLicensePlateNumber())
            .append("exitPort", getExitPort())
            .append("vehicle Status", getVehicleStatus())
            .append("effectiveLoadingDimensions", getEffectiveLoadingDimensions())
            .append("numberOfAxles", getNumberOfAxles())
            .append("loadCapacity", getLoadCapacity())
            .append("estimatedShippingCost", getEstimatedShippingCost())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("remark", getRemark())
            .append("updateBy", getUpdateBy())
            .toString();
    }
}

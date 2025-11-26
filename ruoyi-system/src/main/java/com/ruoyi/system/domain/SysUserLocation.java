package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户定位记录对象 sys_user_location
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysUserLocation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 纬度 */
    @Excel(name = "纬度")
    private BigDecimal latitude;

    /** 经度 */
    @Excel(name = "经度")
    private BigDecimal longitude;

    /** 海拔(米) */
    @Excel(name = "海拔(米)")
    private BigDecimal altitude;

    /** 速度(km/h) */
    @Excel(name = "速度(km/h)")
    private BigDecimal speed;

    /** 方向(度) */
    @Excel(name = "方向(度)")
    private BigDecimal direction;

    /** 精度(米) */
    @Excel(name = "精度(米)")
    private BigDecimal accuracy;

    /** 坐标类型(WGS84/GCJ02/BD09) */
    @Excel(name = "坐标类型(WGS84/GCJ02/BD09)")
    private String coordinateType;

    /** 设备信息 */
    @Excel(name = "设备信息")
    private String deviceInfo;

    /** 定位时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "定位时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date locationTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setLatitude(BigDecimal latitude) 
    {
        this.latitude = latitude;
    }

    public BigDecimal getLatitude() 
    {
        return latitude;
    }

    public void setLongitude(BigDecimal longitude) 
    {
        this.longitude = longitude;
    }

    public BigDecimal getLongitude() 
    {
        return longitude;
    }

    public void setAltitude(BigDecimal altitude) 
    {
        this.altitude = altitude;
    }

    public BigDecimal getAltitude() 
    {
        return altitude;
    }

    public void setSpeed(BigDecimal speed) 
    {
        this.speed = speed;
    }

    public BigDecimal getSpeed() 
    {
        return speed;
    }

    public void setDirection(BigDecimal direction) 
    {
        this.direction = direction;
    }

    public BigDecimal getDirection() 
    {
        return direction;
    }

    public void setAccuracy(BigDecimal accuracy) 
    {
        this.accuracy = accuracy;
    }

    public BigDecimal getAccuracy() 
    {
        return accuracy;
    }

    public void setCoordinateType(String coordinateType) 
    {
        this.coordinateType = coordinateType;
    }

    public String getCoordinateType() 
    {
        return coordinateType;
    }

    public void setDeviceInfo(String deviceInfo) 
    {
        this.deviceInfo = deviceInfo;
    }

    public String getDeviceInfo() 
    {
        return deviceInfo;
    }

    public void setLocationTime(Date locationTime) 
    {
        this.locationTime = locationTime;
    }

    public Date getLocationTime() 
    {
        return locationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("latitude", getLatitude())
            .append("longitude", getLongitude())
            .append("altitude", getAltitude())
            .append("speed", getSpeed())
            .append("direction", getDirection())
            .append("accuracy", getAccuracy())
            .append("coordinateType", getCoordinateType())
            .append("deviceInfo", getDeviceInfo())
            .append("locationTime", getLocationTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}

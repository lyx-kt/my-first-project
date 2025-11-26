package com.ruoyi.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 用户定位表对象 sys_gps_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */

public class SysGpsInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户 */
    private String userId;

    /** 纬度 */
    @Excel(name = "纬度")
    private String latitude;

    /** 经度 */
    @Excel(name = "经度")
    private String longitude;

    /** 海拔 */
    @Excel(name = "海拔")
    private String altitude;

    /** 速度 */
    @Excel(name = "速度")
    private String speed;

    /** 坐标类型 */
    @Excel(name = "坐标类型")
    private String coordinateType;

    /** 定位时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "定位时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date locationTime;

    public void setUserId(String userId) 
    {
        this.userId = userId;
    }

    public String getUserId() 
    {
        return userId;
    }

    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }

    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }

    public void setAltitude(String altitude) 
    {
        this.altitude = altitude;
    }

    public String getAltitude() 
    {
        return altitude;
    }

    public void setSpeed(String speed) 
    {
        this.speed = speed;
    }

    public String getSpeed() 
    {
        return speed;
    }

    public void setCoordinateType(String coordinateType) 
    {
        this.coordinateType = coordinateType;
    }

    public String getCoordinateType() 
    {
        return coordinateType;
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
            .append("userId", getUserId())
            .append("latitude", getLatitude())
            .append("longitude", getLongitude())
            .append("altitude", getAltitude())
            .append("speed", getSpeed())
            .append("coordinateType", getCoordinateType())
            .append("locationTime", getLocationTime())
            .append("createTime", getCreateTime())
            .toString();
    }
}

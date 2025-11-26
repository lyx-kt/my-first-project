package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 货源大厅对象 sys_cargo_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCargoInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单号 */
    private String orderNumber;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date releaseTime;

    /** 始发地址 */
    @Excel(name = "始发地址")
    private String originAddress;

    /** 离境口岸 */
    @Excel(name = "离境口岸")
    private String exitPort;

    /** 卸货地址 */
    @Excel(name = "卸货地址")
    private String unloadingAddress;

    /** 入境口岸 */
    @Excel(name = "入境口岸")
    private String portEntry;

    /** 预计到港时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预计到港时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date estimatedTimeArrival;

    /** 货物品名 */
    @Excel(name = "货物品名")
    private String goodName;

    /** 货物重量kg */
    @Excel(name = "货物重量kg")
    private Long goodWeight;

    /** 货物体积 */
    @Excel(name = "货物体积")
    private Long goodVolume;

    /** 包装方式(裸装0，其他包装1,纸制或纤维板制盒2,再生木托3) */
    @Excel(name = "包装方式(裸装0，其他包装1,纸制或纤维板制盒2,再生木托3)")
    private String packagingMethod;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }

    public void setReleaseTime(Date releaseTime) 
    {
        this.releaseTime = releaseTime;
    }

    public Date getReleaseTime() 
    {
        return releaseTime;
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

    public void setUnloadingAddress(String unloadingAddress) 
    {
        this.unloadingAddress = unloadingAddress;
    }

    public String getUnloadingAddress() 
    {
        return unloadingAddress;
    }

    public void setPortEntry(String portEntry) 
    {
        this.portEntry = portEntry;
    }

    public String getPortEntry() 
    {
        return portEntry;
    }

    public void setEstimatedTimeArrival(Date estimatedTimeArrival) 
    {
        this.estimatedTimeArrival = estimatedTimeArrival;
    }

    public Date getEstimatedTimeArrival() 
    {
        return estimatedTimeArrival;
    }

    public void setGoodName(String goodName) 
    {
        this.goodName = goodName;
    }

    public String getGoodName() 
    {
        return goodName;
    }

    public void setGoodWeight(Long goodWeight) 
    {
        this.goodWeight = goodWeight;
    }

    public Long getGoodWeight() 
    {
        return goodWeight;
    }

    public void setGoodVolume(Long goodVolume) 
    {
        this.goodVolume = goodVolume;
    }

    public Long getGoodVolume() 
    {
        return goodVolume;
    }

    public void setPackagingMethod(String packagingMethod) 
    {
        this.packagingMethod = packagingMethod;
    }

    public String getPackagingMethod() 
    {
        return packagingMethod;
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
            .append("orderNumber", getOrderNumber())
            .append("releaseTime", getReleaseTime())
            .append("originAddress", getOriginAddress())
            .append("exitPort", getExitPort())
            .append("unloadingAddress", getUnloadingAddress())
            .append("portEntry", getPortEntry())
            .append("estimatedTimeArrival", getEstimatedTimeArrival())
            .append("goodName", getGoodName())
            .append("goodWeight", getGoodWeight())
            .append("goodVolume", getGoodVolume())
            .append("packagingMethod", getPackagingMethod())
            .append("createTime", getCreateTime())
            .append("dateTime", getDateTime())
            .append("createBy", getCreateBy())
            .append("updateBy", getUpdateBy())
            .append("remark", getRemark())
            .toString();
    }
}

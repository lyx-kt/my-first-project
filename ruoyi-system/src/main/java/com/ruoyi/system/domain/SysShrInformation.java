package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收货人实名认证对象 sys_shr_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysShrInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家 */
    private String scountry;

    /** 姓名 */
    @Excel(name = "姓名")
    private String sname;

    /** 电话 */
    @Excel(name = "电话")
    private String snumber;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String stype;

    /** 证件号 */
    @Excel(name = "证件号")
    private String szjNumbvber;

    /** 证件正反面 */
    @Excel(name = "证件正反面")
    private String szjZfm;

    public void setScountry(String scountry) 
    {
        this.scountry = scountry;
    }

    public String getScountry() 
    {
        return scountry;
    }

    public void setSname(String sname) 
    {
        this.sname = sname;
    }

    public String getSname() 
    {
        return sname;
    }

    public void setSnumber(String snumber) 
    {
        this.snumber = snumber;
    }

    public String getSnumber() 
    {
        return snumber;
    }

    public void setStype(String stype) 
    {
        this.stype = stype;
    }

    public String getStype() 
    {
        return stype;
    }

    public void setSzjNumbvber(String szjNumbvber) 
    {
        this.szjNumbvber = szjNumbvber;
    }

    public String getSzjNumbvber() 
    {
        return szjNumbvber;
    }

    public void setSzjZfm(String szjZfm) 
    {
        this.szjZfm = szjZfm;
    }

    public String getSzjZfm() 
    {
        return szjZfm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("scountry", getScountry())
            .append("sname", getSname())
            .append("snumber", getSnumber())
            .append("stype", getStype())
            .append("szjNumbvber", getSzjNumbvber())
            .append("szjZfm", getSzjZfm())
            .toString();
    }
}

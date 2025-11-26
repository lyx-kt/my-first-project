package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 发运人实名认证对象 sys_fyr_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysFyrInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家 */
    private String fcountry;

    /** 姓名 */
    @Excel(name = "姓名")
    private String fname;

    /** 电话 */
    @Excel(name = "电话")
    private String fnumber;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String ftype;

    /** 证件号 */
    @Excel(name = "证件号")
    private String fzjNumbvber;

    /** 证件正反面 */
    @Excel(name = "证件正反面")
    private String fzjZfm;

    public void setFcountry(String fcountry) 
    {
        this.fcountry = fcountry;
    }

    public String getFcountry() 
    {
        return fcountry;
    }

    public void setFname(String fname) 
    {
        this.fname = fname;
    }

    public String getFname() 
    {
        return fname;
    }

    public void setFnumber(String fnumber) 
    {
        this.fnumber = fnumber;
    }

    public String getFnumber() 
    {
        return fnumber;
    }

    public void setFtype(String ftype) 
    {
        this.ftype = ftype;
    }

    public String getFtype() 
    {
        return ftype;
    }

    public void setFzjNumbvber(String fzjNumbvber) 
    {
        this.fzjNumbvber = fzjNumbvber;
    }

    public String getFzjNumbvber() 
    {
        return fzjNumbvber;
    }

    public void setFzjZfm(String fzjZfm) 
    {
        this.fzjZfm = fzjZfm;
    }

    public String getFzjZfm() 
    {
        return fzjZfm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("fcountry", getFcountry())
            .append("fname", getFname())
            .append("fnumber", getFnumber())
            .append("ftype", getFtype())
            .append("fzjNumbvber", getFzjNumbvber())
            .append("fzjZfm", getFzjZfm())
            .toString();
    }
}

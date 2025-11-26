package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 承运人实名认证对象 sys_cyr_information
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public class SysCyrInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 国家 */
    private String ccountry;

    /** 姓名 */
    @Excel(name = "姓名")
    private String cname;

    /** 电话 */
    @Excel(name = "电话")
    private String cnumber;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String ctype;

    /** 证件号 */
    @Excel(name = "证件号")
    private String czjNumbvber;

    /** 证件正反面 */
    @Excel(name = "证件正反面")
    private String czjZfm;

    public void setCcountry(String ccountry) 
    {
        this.ccountry = ccountry;
    }

    public String getCcountry() 
    {
        return ccountry;
    }

    public void setCname(String cname) 
    {
        this.cname = cname;
    }

    public String getCname() 
    {
        return cname;
    }

    public void setCnumber(String cnumber) 
    {
        this.cnumber = cnumber;
    }

    public String getCnumber() 
    {
        return cnumber;
    }

    public void setCtype(String ctype) 
    {
        this.ctype = ctype;
    }

    public String getCtype() 
    {
        return ctype;
    }

    public void setCzjNumbvber(String czjNumbvber) 
    {
        this.czjNumbvber = czjNumbvber;
    }

    public String getCzjNumbvber() 
    {
        return czjNumbvber;
    }

    public void setCzjZfm(String czjZfm) 
    {
        this.czjZfm = czjZfm;
    }

    public String getCzjZfm() 
    {
        return czjZfm;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ccountry", getCcountry())
            .append("cname", getCname())
            .append("cnumber", getCnumber())
            .append("ctype", getCtype())
            .append("czjNumbvber", getCzjNumbvber())
            .append("czjZfm", getCzjZfm())
            .toString();
    }
}

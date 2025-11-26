package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysYunshuCompany;

/**
 * 运输备案公司Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysYunshuCompanyMapper 
{
    /**
     * 查询运输备案公司
     * 
     * @param companyName 运输备案公司主键
     * @return 运输备案公司
     */
    public SysYunshuCompany selectSysYunshuCompanyByCompanyName(String companyName);

    /**
     * 查询运输备案公司列表
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 运输备案公司集合
     */
    public List<SysYunshuCompany> selectSysYunshuCompanyList(SysYunshuCompany sysYunshuCompany);

    /**
     * 新增运输备案公司
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 结果
     */
    public int insertSysYunshuCompany(SysYunshuCompany sysYunshuCompany);

    /**
     * 修改运输备案公司
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 结果
     */
    public int updateSysYunshuCompany(SysYunshuCompany sysYunshuCompany);

    /**
     * 删除运输备案公司
     * 
     * @param companyName 运输备案公司主键
     * @return 结果
     */
    public int deleteSysYunshuCompanyByCompanyName(String companyName);

    /**
     * 批量删除运输备案公司
     * 
     * @param companyNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysYunshuCompanyByCompanyNames(String[] companyNames);
}

package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysYunshuCompanyMapper;
import com.ruoyi.system.domain.SysYunshuCompany;
import com.ruoyi.system.service.ISysYunshuCompanyService;

/**
 * 运输备案公司Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysYunshuCompanyServiceImpl implements ISysYunshuCompanyService 
{
    @Autowired
    private SysYunshuCompanyMapper sysYunshuCompanyMapper;

    /**
     * 查询运输备案公司
     * 
     * @param companyName 运输备案公司主键
     * @return 运输备案公司
     */
    @Override
    public SysYunshuCompany selectSysYunshuCompanyByCompanyName(String companyName)
    {
        return sysYunshuCompanyMapper.selectSysYunshuCompanyByCompanyName(companyName);
    }

    /**
     * 查询运输备案公司列表
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 运输备案公司
     */
    @Override
    public List<SysYunshuCompany> selectSysYunshuCompanyList(SysYunshuCompany sysYunshuCompany)
    {
        return sysYunshuCompanyMapper.selectSysYunshuCompanyList(sysYunshuCompany);
    }

    /**
     * 新增运输备案公司
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 结果
     */
    @Override
    public int insertSysYunshuCompany(SysYunshuCompany sysYunshuCompany)
    {
        sysYunshuCompany.setCreateTime(DateUtils.getNowDate());
        return sysYunshuCompanyMapper.insertSysYunshuCompany(sysYunshuCompany);
    }

    /**
     * 修改运输备案公司
     * 
     * @param sysYunshuCompany 运输备案公司
     * @return 结果
     */
    @Override
    public int updateSysYunshuCompany(SysYunshuCompany sysYunshuCompany)
    {
        return sysYunshuCompanyMapper.updateSysYunshuCompany(sysYunshuCompany);
    }

    /**
     * 批量删除运输备案公司
     * 
     * @param companyNames 需要删除的运输备案公司主键
     * @return 结果
     */
    @Override
    public int deleteSysYunshuCompanyByCompanyNames(String[] companyNames)
    {
        return sysYunshuCompanyMapper.deleteSysYunshuCompanyByCompanyNames(companyNames);
    }

    /**
     * 删除运输备案公司信息
     * 
     * @param companyName 运输备案公司主键
     * @return 结果
     */
    @Override
    public int deleteSysYunshuCompanyByCompanyName(String companyName)
    {
        return sysYunshuCompanyMapper.deleteSysYunshuCompanyByCompanyName(companyName);
    }
}

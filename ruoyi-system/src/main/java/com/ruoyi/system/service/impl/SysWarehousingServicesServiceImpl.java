package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysWarehousingServicesMapper;
import com.ruoyi.system.domain.SysWarehousingServices;
import com.ruoyi.system.service.ISysWarehousingServicesService;

/**
 * 仓储服务Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysWarehousingServicesServiceImpl implements ISysWarehousingServicesService 
{
    @Autowired
    private SysWarehousingServicesMapper sysWarehousingServicesMapper;

    /**
     * 查询仓储服务
     * 
     * @param companyName 仓储服务主键
     * @return 仓储服务
     */
    @Override
    public SysWarehousingServices selectSysWarehousingServicesByCompanyName(String companyName)
    {
        return sysWarehousingServicesMapper.selectSysWarehousingServicesByCompanyName(companyName);
    }

    /**
     * 查询仓储服务列表
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 仓储服务
     */
    @Override
    public List<SysWarehousingServices> selectSysWarehousingServicesList(SysWarehousingServices sysWarehousingServices)
    {
        return sysWarehousingServicesMapper.selectSysWarehousingServicesList(sysWarehousingServices);
    }

    /**
     * 新增仓储服务
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 结果
     */
    @Override
    public int insertSysWarehousingServices(SysWarehousingServices sysWarehousingServices)
    {
        sysWarehousingServices.setCreateTime(DateUtils.getNowDate());
        return sysWarehousingServicesMapper.insertSysWarehousingServices(sysWarehousingServices);
    }

    /**
     * 修改仓储服务
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 结果
     */
    @Override
    public int updateSysWarehousingServices(SysWarehousingServices sysWarehousingServices)
    {
        return sysWarehousingServicesMapper.updateSysWarehousingServices(sysWarehousingServices);
    }

    /**
     * 批量删除仓储服务
     * 
     * @param companyNames 需要删除的仓储服务主键
     * @return 结果
     */
    @Override
    public int deleteSysWarehousingServicesByCompanyNames(String[] companyNames)
    {
        return sysWarehousingServicesMapper.deleteSysWarehousingServicesByCompanyNames(companyNames);
    }

    /**
     * 删除仓储服务信息
     * 
     * @param companyName 仓储服务主键
     * @return 结果
     */
    @Override
    public int deleteSysWarehousingServicesByCompanyName(String companyName)
    {
        return sysWarehousingServicesMapper.deleteSysWarehousingServicesByCompanyName(companyName);
    }
}

package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysWarehousingServices;

/**
 * 仓储服务Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysWarehousingServicesMapper 
{
    /**
     * 查询仓储服务
     * 
     * @param companyName 仓储服务主键
     * @return 仓储服务
     */
    public SysWarehousingServices selectSysWarehousingServicesByCompanyName(String companyName);

    /**
     * 查询仓储服务列表
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 仓储服务集合
     */
    public List<SysWarehousingServices> selectSysWarehousingServicesList(SysWarehousingServices sysWarehousingServices);

    /**
     * 新增仓储服务
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 结果
     */
    public int insertSysWarehousingServices(SysWarehousingServices sysWarehousingServices);

    /**
     * 修改仓储服务
     * 
     * @param sysWarehousingServices 仓储服务
     * @return 结果
     */
    public int updateSysWarehousingServices(SysWarehousingServices sysWarehousingServices);

    /**
     * 删除仓储服务
     * 
     * @param companyName 仓储服务主键
     * @return 结果
     */
    public int deleteSysWarehousingServicesByCompanyName(String companyName);

    /**
     * 批量删除仓储服务
     * 
     * @param companyNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysWarehousingServicesByCompanyNames(String[] companyNames);
}

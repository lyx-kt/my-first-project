package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysVehicleRegistrationApplication;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysVehicleRegistrationApplicationMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param carrierName 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysVehicleRegistrationApplication selectSysVehicleRegistrationApplicationByCarrierName(String carrierName);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysVehicleRegistrationApplication> selectSysVehicleRegistrationApplicationList(SysVehicleRegistrationApplication sysVehicleRegistrationApplication);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 结果
     */
    public int insertSysVehicleRegistrationApplication(SysVehicleRegistrationApplication sysVehicleRegistrationApplication);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVehicleRegistrationApplication 【请填写功能名称】
     * @return 结果
     */
    public int updateSysVehicleRegistrationApplication(SysVehicleRegistrationApplication sysVehicleRegistrationApplication);

    /**
     * 删除【请填写功能名称】
     * 
     * @param carrierName 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysVehicleRegistrationApplicationByCarrierName(String carrierName);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param carrierNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysVehicleRegistrationApplicationByCarrierNames(String[] carrierNames);
}

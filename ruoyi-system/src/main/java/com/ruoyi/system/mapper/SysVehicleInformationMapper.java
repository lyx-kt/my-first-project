package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysVehicleInformation;

/**
 * 线路大厅Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysVehicleInformationMapper 
{
    /**
     * 查询线路大厅
     * 
     * @param placeOfDeparture 线路大厅主键
     * @return 线路大厅
     */
    public SysVehicleInformation selectSysVehicleInformationByPlaceOfDeparture(String placeOfDeparture);

    /**
     * 查询线路大厅列表
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 线路大厅集合
     */
    public List<SysVehicleInformation> selectSysVehicleInformationList(SysVehicleInformation sysVehicleInformation);

    /**
     * 新增线路大厅
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 结果
     */
    public int insertSysVehicleInformation(SysVehicleInformation sysVehicleInformation);

    /**
     * 修改线路大厅
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 结果
     */
    public int updateSysVehicleInformation(SysVehicleInformation sysVehicleInformation);

    /**
     * 删除线路大厅
     * 
     * @param placeOfDeparture 线路大厅主键
     * @return 结果
     */
    public int deleteSysVehicleInformationByPlaceOfDeparture(String placeOfDeparture);

    /**
     * 批量删除线路大厅
     * 
     * @param placeOfDepartures 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysVehicleInformationByPlaceOfDepartures(String[] placeOfDepartures);
}

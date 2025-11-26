package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysVehicleInformationMapper;
import com.ruoyi.system.domain.SysVehicleInformation;
import com.ruoyi.system.service.ISysVehicleInformationService;

/**
 * 线路大厅Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysVehicleInformationServiceImpl implements ISysVehicleInformationService 
{
    @Autowired
    private SysVehicleInformationMapper sysVehicleInformationMapper;

    /**
     * 查询线路大厅
     * 
     * @param placeOfDeparture 线路大厅主键
     * @return 线路大厅
     */
    @Override
    public SysVehicleInformation selectSysVehicleInformationByPlaceOfDeparture(String placeOfDeparture)
    {
        return sysVehicleInformationMapper.selectSysVehicleInformationByPlaceOfDeparture(placeOfDeparture);
    }

    /**
     * 查询线路大厅列表
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 线路大厅
     */
    @Override
    public List<SysVehicleInformation> selectSysVehicleInformationList(SysVehicleInformation sysVehicleInformation)
    {
        return sysVehicleInformationMapper.selectSysVehicleInformationList(sysVehicleInformation);
    }

    /**
     * 新增线路大厅
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 结果
     */
    @Override
    public int insertSysVehicleInformation(SysVehicleInformation sysVehicleInformation)
    {
        sysVehicleInformation.setCreateTime(DateUtils.getNowDate());
        return sysVehicleInformationMapper.insertSysVehicleInformation(sysVehicleInformation);
    }

    /**
     * 修改线路大厅
     * 
     * @param sysVehicleInformation 线路大厅
     * @return 结果
     */
    @Override
    public int updateSysVehicleInformation(SysVehicleInformation sysVehicleInformation)
    {
        return sysVehicleInformationMapper.updateSysVehicleInformation(sysVehicleInformation);
    }

    /**
     * 批量删除线路大厅
     * 
     * @param placeOfDepartures 需要删除的线路大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysVehicleInformationByPlaceOfDepartures(String[] placeOfDepartures)
    {
        return sysVehicleInformationMapper.deleteSysVehicleInformationByPlaceOfDepartures(placeOfDepartures);
    }

    /**
     * 删除线路大厅信息
     * 
     * @param placeOfDeparture 线路大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysVehicleInformationByPlaceOfDeparture(String placeOfDeparture)
    {
        return sysVehicleInformationMapper.deleteSysVehicleInformationByPlaceOfDeparture(placeOfDeparture);
    }
}

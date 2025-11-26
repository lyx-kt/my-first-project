package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCarrierAcceptOrderMapper;
import com.ruoyi.system.domain.SysCarrierAcceptOrder;
import com.ruoyi.system.service.ISysCarrierAcceptOrderService;

/**
 * 货源大厅Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCarrierAcceptOrderServiceImpl implements ISysCarrierAcceptOrderService 
{
    @Autowired
    private SysCarrierAcceptOrderMapper sysCarrierAcceptOrderMapper;

    /**
     * 查询货源大厅
     * 
     * @param cargoInformation 货源大厅主键
     * @return 货源大厅
     */
    @Override
    public SysCarrierAcceptOrder selectSysCarrierAcceptOrderByCargoInformation(String cargoInformation)
    {
        return sysCarrierAcceptOrderMapper.selectSysCarrierAcceptOrderByCargoInformation(cargoInformation);
    }

    /**
     * 查询货源大厅列表
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 货源大厅
     */
    @Override
    public List<SysCarrierAcceptOrder> selectSysCarrierAcceptOrderList(SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        return sysCarrierAcceptOrderMapper.selectSysCarrierAcceptOrderList(sysCarrierAcceptOrder);
    }

    /**
     * 新增货源大厅
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 结果
     */
    @Override
    public int insertSysCarrierAcceptOrder(SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        return sysCarrierAcceptOrderMapper.insertSysCarrierAcceptOrder(sysCarrierAcceptOrder);
    }

    /**
     * 修改货源大厅
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 结果
     */
    @Override
    public int updateSysCarrierAcceptOrder(SysCarrierAcceptOrder sysCarrierAcceptOrder)
    {
        return sysCarrierAcceptOrderMapper.updateSysCarrierAcceptOrder(sysCarrierAcceptOrder);
    }

    /**
     * 批量删除货源大厅
     * 
     * @param cargoInformations 需要删除的货源大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysCarrierAcceptOrderByCargoInformations(String[] cargoInformations)
    {
        return sysCarrierAcceptOrderMapper.deleteSysCarrierAcceptOrderByCargoInformations(cargoInformations);
    }

    /**
     * 删除货源大厅信息
     * 
     * @param cargoInformation 货源大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysCarrierAcceptOrderByCargoInformation(String cargoInformation)
    {
        return sysCarrierAcceptOrderMapper.deleteSysCarrierAcceptOrderByCargoInformation(cargoInformation);
    }
}

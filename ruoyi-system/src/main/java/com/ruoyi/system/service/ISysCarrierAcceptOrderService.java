package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysCarrierAcceptOrder;

/**
 * 货源大厅Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysCarrierAcceptOrderService 
{
    /**
     * 查询货源大厅
     * 
     * @param cargoInformation 货源大厅主键
     * @return 货源大厅
     */
    public SysCarrierAcceptOrder selectSysCarrierAcceptOrderByCargoInformation(String cargoInformation);

    /**
     * 查询货源大厅列表
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 货源大厅集合
     */
    public List<SysCarrierAcceptOrder> selectSysCarrierAcceptOrderList(SysCarrierAcceptOrder sysCarrierAcceptOrder);

    /**
     * 新增货源大厅
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 结果
     */
    public int insertSysCarrierAcceptOrder(SysCarrierAcceptOrder sysCarrierAcceptOrder);

    /**
     * 修改货源大厅
     * 
     * @param sysCarrierAcceptOrder 货源大厅
     * @return 结果
     */
    public int updateSysCarrierAcceptOrder(SysCarrierAcceptOrder sysCarrierAcceptOrder);

    /**
     * 批量删除货源大厅
     * 
     * @param cargoInformations 需要删除的货源大厅主键集合
     * @return 结果
     */
    public int deleteSysCarrierAcceptOrderByCargoInformations(String[] cargoInformations);

    /**
     * 删除货源大厅信息
     * 
     * @param cargoInformation 货源大厅主键
     * @return 结果
     */
    public int deleteSysCarrierAcceptOrderByCargoInformation(String cargoInformation);
}

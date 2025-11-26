package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCarrierAcceptOrder;

/**
 * 货源大厅Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCarrierAcceptOrderMapper 
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
     * 删除货源大厅
     * 
     * @param cargoInformation 货源大厅主键
     * @return 结果
     */
    public int deleteSysCarrierAcceptOrderByCargoInformation(String cargoInformation);

    /**
     * 批量删除货源大厅
     * 
     * @param cargoInformations 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCarrierAcceptOrderByCargoInformations(String[] cargoInformations);
}

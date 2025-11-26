package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCargoInformation;

/**
 * 货源大厅Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCargoInformationMapper 
{
    /**
     * 查询货源大厅
     * 
     * @param orderNumber 货源大厅主键
     * @return 货源大厅
     */
    public SysCargoInformation selectSysCargoInformationByOrderNumber(String orderNumber);

    /**
     * 查询货源大厅列表
     * 
     * @param sysCargoInformation 货源大厅
     * @return 货源大厅集合
     */
    public List<SysCargoInformation> selectSysCargoInformationList(SysCargoInformation sysCargoInformation);

    /**
     * 新增货源大厅
     * 
     * @param sysCargoInformation 货源大厅
     * @return 结果
     */
    public int insertSysCargoInformation(SysCargoInformation sysCargoInformation);

    /**
     * 修改货源大厅
     * 
     * @param sysCargoInformation 货源大厅
     * @return 结果
     */
    public int updateSysCargoInformation(SysCargoInformation sysCargoInformation);

    /**
     * 删除货源大厅
     * 
     * @param orderNumber 货源大厅主键
     * @return 结果
     */
    public int deleteSysCargoInformationByOrderNumber(String orderNumber);

    /**
     * 批量删除货源大厅
     * 
     * @param orderNumbers 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCargoInformationByOrderNumbers(String[] orderNumbers);
}

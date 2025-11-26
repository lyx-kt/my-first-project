package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysCarrierInformation;

/**
 * 线路详情Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysCarrierInformationService 
{
    /**
     * 查询线路详情
     * 
     * @param carrierNamecarrier 线路详情主键
     * @return 线路详情
     */
    public SysCarrierInformation selectSysCarrierInformationByCarrierNamecarrier(String carrierNamecarrier);

    /**
     * 查询线路详情列表
     * 
     * @param sysCarrierInformation 线路详情
     * @return 线路详情集合
     */
    public List<SysCarrierInformation> selectSysCarrierInformationList(SysCarrierInformation sysCarrierInformation);

    /**
     * 新增线路详情
     * 
     * @param sysCarrierInformation 线路详情
     * @return 结果
     */
    public int insertSysCarrierInformation(SysCarrierInformation sysCarrierInformation);

    /**
     * 修改线路详情
     * 
     * @param sysCarrierInformation 线路详情
     * @return 结果
     */
    public int updateSysCarrierInformation(SysCarrierInformation sysCarrierInformation);

    /**
     * 批量删除线路详情
     * 
     * @param carrierNamecarriers 需要删除的线路详情主键集合
     * @return 结果
     */
    public int deleteSysCarrierInformationByCarrierNamecarriers(String[] carrierNamecarriers);

    /**
     * 删除线路详情信息
     * 
     * @param carrierNamecarrier 线路详情主键
     * @return 结果
     */
    public int deleteSysCarrierInformationByCarrierNamecarrier(String carrierNamecarrier);
}

package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCarrierInformationMapper;
import com.ruoyi.system.domain.SysCarrierInformation;
import com.ruoyi.system.service.ISysCarrierInformationService;

/**
 * 线路详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCarrierInformationServiceImpl implements ISysCarrierInformationService 
{
    @Autowired
    private SysCarrierInformationMapper sysCarrierInformationMapper;

    /**
     * 查询线路详情
     * 
     * @param carrierNamecarrier 线路详情主键
     * @return 线路详情
     */
    @Override
    public SysCarrierInformation selectSysCarrierInformationByCarrierNamecarrier(String carrierNamecarrier)
    {
        return sysCarrierInformationMapper.selectSysCarrierInformationByCarrierNamecarrier(carrierNamecarrier);
    }

    /**
     * 查询线路详情列表
     * 
     * @param sysCarrierInformation 线路详情
     * @return 线路详情
     */
    @Override
    public List<SysCarrierInformation> selectSysCarrierInformationList(SysCarrierInformation sysCarrierInformation)
    {
        return sysCarrierInformationMapper.selectSysCarrierInformationList(sysCarrierInformation);
    }

    /**
     * 新增线路详情
     * 
     * @param sysCarrierInformation 线路详情
     * @return 结果
     */
    @Override
    public int insertSysCarrierInformation(SysCarrierInformation sysCarrierInformation)
    {
        sysCarrierInformation.setCreateTime(DateUtils.getNowDate());
        return sysCarrierInformationMapper.insertSysCarrierInformation(sysCarrierInformation);
    }

    /**
     * 修改线路详情
     * 
     * @param sysCarrierInformation 线路详情
     * @return 结果
     */
    @Override
    public int updateSysCarrierInformation(SysCarrierInformation sysCarrierInformation)
    {
        return sysCarrierInformationMapper.updateSysCarrierInformation(sysCarrierInformation);
    }

    /**
     * 批量删除线路详情
     * 
     * @param carrierNamecarriers 需要删除的线路详情主键
     * @return 结果
     */
    @Override
    public int deleteSysCarrierInformationByCarrierNamecarriers(String[] carrierNamecarriers)
    {
        return sysCarrierInformationMapper.deleteSysCarrierInformationByCarrierNamecarriers(carrierNamecarriers);
    }

    /**
     * 删除线路详情信息
     * 
     * @param carrierNamecarrier 线路详情主键
     * @return 结果
     */
    @Override
    public int deleteSysCarrierInformationByCarrierNamecarrier(String carrierNamecarrier)
    {
        return sysCarrierInformationMapper.deleteSysCarrierInformationByCarrierNamecarrier(carrierNamecarrier);
    }
}

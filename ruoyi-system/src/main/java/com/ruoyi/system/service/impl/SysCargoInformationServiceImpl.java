package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCargoInformationMapper;
import com.ruoyi.system.domain.SysCargoInformation;
import com.ruoyi.system.service.ISysCargoInformationService;

/**
 * 货源大厅Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCargoInformationServiceImpl implements ISysCargoInformationService 
{
    @Autowired
    private SysCargoInformationMapper sysCargoInformationMapper;

    /**
     * 查询货源大厅
     * 
     * @param orderNumber 货源大厅主键
     * @return 货源大厅
     */
    @Override
    public SysCargoInformation selectSysCargoInformationByOrderNumber(String orderNumber)
    {
        return sysCargoInformationMapper.selectSysCargoInformationByOrderNumber(orderNumber);
    }

    /**
     * 查询货源大厅列表
     * 
     * @param sysCargoInformation 货源大厅
     * @return 货源大厅
     */
    @Override
    public List<SysCargoInformation> selectSysCargoInformationList(SysCargoInformation sysCargoInformation)
    {
        return sysCargoInformationMapper.selectSysCargoInformationList(sysCargoInformation);
    }

    /**
     * 新增货源大厅
     * 
     * @param sysCargoInformation 货源大厅
     * @return 结果
     */
    @Override
    public int insertSysCargoInformation(SysCargoInformation sysCargoInformation)
    {
        sysCargoInformation.setCreateTime(DateUtils.getNowDate());
        return sysCargoInformationMapper.insertSysCargoInformation(sysCargoInformation);
    }

    /**
     * 修改货源大厅
     * 
     * @param sysCargoInformation 货源大厅
     * @return 结果
     */
    @Override
    public int updateSysCargoInformation(SysCargoInformation sysCargoInformation)
    {
        return sysCargoInformationMapper.updateSysCargoInformation(sysCargoInformation);
    }

    /**
     * 批量删除货源大厅
     * 
     * @param orderNumbers 需要删除的货源大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysCargoInformationByOrderNumbers(String[] orderNumbers)
    {
        return sysCargoInformationMapper.deleteSysCargoInformationByOrderNumbers(orderNumbers);
    }

    /**
     * 删除货源大厅信息
     * 
     * @param orderNumber 货源大厅主键
     * @return 结果
     */
    @Override
    public int deleteSysCargoInformationByOrderNumber(String orderNumber)
    {
        return sysCargoInformationMapper.deleteSysCargoInformationByOrderNumber(orderNumber);
    }
}

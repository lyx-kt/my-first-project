package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCustomsDeclarationMapper;
import com.ruoyi.system.domain.SysCustomsDeclaration;
import com.ruoyi.system.service.ISysCustomsDeclarationService;

/**
 * 承运人确报Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCustomsDeclarationServiceImpl implements ISysCustomsDeclarationService 
{
    @Autowired
    private SysCustomsDeclarationMapper sysCustomsDeclarationMapper;

    /**
     * 查询承运人确报
     * 
     * @param carrierName 承运人确报主键
     * @return 承运人确报
     */
    @Override
    public SysCustomsDeclaration selectSysCustomsDeclarationByCarrierName(String carrierName)
    {
        return sysCustomsDeclarationMapper.selectSysCustomsDeclarationByCarrierName(carrierName);
    }

    /**
     * 查询承运人确报列表
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 承运人确报
     */
    @Override
    public List<SysCustomsDeclaration> selectSysCustomsDeclarationList(SysCustomsDeclaration sysCustomsDeclaration)
    {
        return sysCustomsDeclarationMapper.selectSysCustomsDeclarationList(sysCustomsDeclaration);
    }

    /**
     * 新增承运人确报
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 结果
     */
    @Override
    public int insertSysCustomsDeclaration(SysCustomsDeclaration sysCustomsDeclaration)
    {
        sysCustomsDeclaration.setCreateTime(DateUtils.getNowDate());
        return sysCustomsDeclarationMapper.insertSysCustomsDeclaration(sysCustomsDeclaration);
    }

    /**
     * 修改承运人确报
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 结果
     */
    @Override
    public int updateSysCustomsDeclaration(SysCustomsDeclaration sysCustomsDeclaration)
    {
        return sysCustomsDeclarationMapper.updateSysCustomsDeclaration(sysCustomsDeclaration);
    }

    /**
     * 批量删除承运人确报
     * 
     * @param carrierNames 需要删除的承运人确报主键
     * @return 结果
     */
    @Override
    public int deleteSysCustomsDeclarationByCarrierNames(String[] carrierNames)
    {
        return sysCustomsDeclarationMapper.deleteSysCustomsDeclarationByCarrierNames(carrierNames);
    }

    /**
     * 删除承运人确报信息
     * 
     * @param carrierName 承运人确报主键
     * @return 结果
     */
    @Override
    public int deleteSysCustomsDeclarationByCarrierName(String carrierName)
    {
        return sysCustomsDeclarationMapper.deleteSysCustomsDeclarationByCarrierName(carrierName);
    }
}

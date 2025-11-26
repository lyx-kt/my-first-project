package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysCyrInformationMapper;
import com.ruoyi.system.domain.SysCyrInformation;
import com.ruoyi.system.service.ISysCyrInformationService;

/**
 * 承运人实名认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysCyrInformationServiceImpl implements ISysCyrInformationService 
{
    @Autowired
    private SysCyrInformationMapper sysCyrInformationMapper;

    /**
     * 查询承运人实名认证
     * 
     * @param ccountry 承运人实名认证主键
     * @return 承运人实名认证
     */
    @Override
    public SysCyrInformation selectSysCyrInformationByCcountry(String ccountry)
    {
        return sysCyrInformationMapper.selectSysCyrInformationByCcountry(ccountry);
    }

    /**
     * 查询承运人实名认证列表
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 承运人实名认证
     */
    @Override
    public List<SysCyrInformation> selectSysCyrInformationList(SysCyrInformation sysCyrInformation)
    {
        return sysCyrInformationMapper.selectSysCyrInformationList(sysCyrInformation);
    }

    /**
     * 新增承运人实名认证
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 结果
     */
    @Override
    public int insertSysCyrInformation(SysCyrInformation sysCyrInformation)
    {
        return sysCyrInformationMapper.insertSysCyrInformation(sysCyrInformation);
    }

    /**
     * 修改承运人实名认证
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 结果
     */
    @Override
    public int updateSysCyrInformation(SysCyrInformation sysCyrInformation)
    {
        return sysCyrInformationMapper.updateSysCyrInformation(sysCyrInformation);
    }

    /**
     * 批量删除承运人实名认证
     * 
     * @param ccountrys 需要删除的承运人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCyrInformationByCcountrys(String[] ccountrys)
    {
        return sysCyrInformationMapper.deleteSysCyrInformationByCcountrys(ccountrys);
    }

    /**
     * 删除承运人实名认证信息
     * 
     * @param ccountry 承运人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysCyrInformationByCcountry(String ccountry)
    {
        return sysCyrInformationMapper.deleteSysCyrInformationByCcountry(ccountry);
    }
}

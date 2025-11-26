package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysFyrInformationMapper;
import com.ruoyi.system.domain.SysFyrInformation;
import com.ruoyi.system.service.ISysFyrInformationService;

/**
 * 发运人实名认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysFyrInformationServiceImpl implements ISysFyrInformationService 
{
    @Autowired
    private SysFyrInformationMapper sysFyrInformationMapper;

    /**
     * 查询发运人实名认证
     * 
     * @param fcountry 发运人实名认证主键
     * @return 发运人实名认证
     */
    @Override
    public SysFyrInformation selectSysFyrInformationByFcountry(String fcountry)
    {
        return sysFyrInformationMapper.selectSysFyrInformationByFcountry(fcountry);
    }

    /**
     * 查询发运人实名认证列表
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 发运人实名认证
     */
    @Override
    public List<SysFyrInformation> selectSysFyrInformationList(SysFyrInformation sysFyrInformation)
    {
        return sysFyrInformationMapper.selectSysFyrInformationList(sysFyrInformation);
    }

    /**
     * 新增发运人实名认证
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 结果
     */
    @Override
    public int insertSysFyrInformation(SysFyrInformation sysFyrInformation)
    {
        return sysFyrInformationMapper.insertSysFyrInformation(sysFyrInformation);
    }

    /**
     * 修改发运人实名认证
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 结果
     */
    @Override
    public int updateSysFyrInformation(SysFyrInformation sysFyrInformation)
    {
        return sysFyrInformationMapper.updateSysFyrInformation(sysFyrInformation);
    }

    /**
     * 批量删除发运人实名认证
     * 
     * @param fcountrys 需要删除的发运人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysFyrInformationByFcountrys(String[] fcountrys)
    {
        return sysFyrInformationMapper.deleteSysFyrInformationByFcountrys(fcountrys);
    }

    /**
     * 删除发运人实名认证信息
     * 
     * @param fcountry 发运人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysFyrInformationByFcountry(String fcountry)
    {
        return sysFyrInformationMapper.deleteSysFyrInformationByFcountry(fcountry);
    }
}

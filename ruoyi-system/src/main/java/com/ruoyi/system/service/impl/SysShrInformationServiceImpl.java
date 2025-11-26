package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysShrInformationMapper;
import com.ruoyi.system.domain.SysShrInformation;
import com.ruoyi.system.service.ISysShrInformationService;

/**
 * 收货人实名认证Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
@Service
public class SysShrInformationServiceImpl implements ISysShrInformationService 
{
    @Autowired
    private SysShrInformationMapper sysShrInformationMapper;

    /**
     * 查询收货人实名认证
     * 
     * @param scountry 收货人实名认证主键
     * @return 收货人实名认证
     */
    @Override
    public SysShrInformation selectSysShrInformationByScountry(String scountry)
    {
        return sysShrInformationMapper.selectSysShrInformationByScountry(scountry);
    }

    /**
     * 查询收货人实名认证列表
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 收货人实名认证
     */
    @Override
    public List<SysShrInformation> selectSysShrInformationList(SysShrInformation sysShrInformation)
    {
        return sysShrInformationMapper.selectSysShrInformationList(sysShrInformation);
    }

    /**
     * 新增收货人实名认证
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 结果
     */
    @Override
    public int insertSysShrInformation(SysShrInformation sysShrInformation)
    {
        return sysShrInformationMapper.insertSysShrInformation(sysShrInformation);
    }

    /**
     * 修改收货人实名认证
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 结果
     */
    @Override
    public int updateSysShrInformation(SysShrInformation sysShrInformation)
    {
        return sysShrInformationMapper.updateSysShrInformation(sysShrInformation);
    }

    /**
     * 批量删除收货人实名认证
     * 
     * @param scountrys 需要删除的收货人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysShrInformationByScountrys(String[] scountrys)
    {
        return sysShrInformationMapper.deleteSysShrInformationByScountrys(scountrys);
    }

    /**
     * 删除收货人实名认证信息
     * 
     * @param scountry 收货人实名认证主键
     * @return 结果
     */
    @Override
    public int deleteSysShrInformationByScountry(String scountry)
    {
        return sysShrInformationMapper.deleteSysShrInformationByScountry(scountry);
    }
}

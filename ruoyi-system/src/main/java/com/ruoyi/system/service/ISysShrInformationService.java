package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysShrInformation;

/**
 * 收货人实名认证Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysShrInformationService 
{
    /**
     * 查询收货人实名认证
     * 
     * @param scountry 收货人实名认证主键
     * @return 收货人实名认证
     */
    public SysShrInformation selectSysShrInformationByScountry(String scountry);

    /**
     * 查询收货人实名认证列表
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 收货人实名认证集合
     */
    public List<SysShrInformation> selectSysShrInformationList(SysShrInformation sysShrInformation);

    /**
     * 新增收货人实名认证
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 结果
     */
    public int insertSysShrInformation(SysShrInformation sysShrInformation);

    /**
     * 修改收货人实名认证
     * 
     * @param sysShrInformation 收货人实名认证
     * @return 结果
     */
    public int updateSysShrInformation(SysShrInformation sysShrInformation);

    /**
     * 批量删除收货人实名认证
     * 
     * @param scountrys 需要删除的收货人实名认证主键集合
     * @return 结果
     */
    public int deleteSysShrInformationByScountrys(String[] scountrys);

    /**
     * 删除收货人实名认证信息
     * 
     * @param scountry 收货人实名认证主键
     * @return 结果
     */
    public int deleteSysShrInformationByScountry(String scountry);
}

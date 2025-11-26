package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysShrInformation;

/**
 * 收货人实名认证Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysShrInformationMapper 
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
     * 删除收货人实名认证
     * 
     * @param scountry 收货人实名认证主键
     * @return 结果
     */
    public int deleteSysShrInformationByScountry(String scountry);

    /**
     * 批量删除收货人实名认证
     * 
     * @param scountrys 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysShrInformationByScountrys(String[] scountrys);
}

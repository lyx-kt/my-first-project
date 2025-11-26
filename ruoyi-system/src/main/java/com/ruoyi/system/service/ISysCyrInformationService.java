package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysCyrInformation;

/**
 * 承运人实名认证Service接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface ISysCyrInformationService 
{
    /**
     * 查询承运人实名认证
     * 
     * @param ccountry 承运人实名认证主键
     * @return 承运人实名认证
     */
    public SysCyrInformation selectSysCyrInformationByCcountry(String ccountry);

    /**
     * 查询承运人实名认证列表
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 承运人实名认证集合
     */
    public List<SysCyrInformation> selectSysCyrInformationList(SysCyrInformation sysCyrInformation);

    /**
     * 新增承运人实名认证
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 结果
     */
    public int insertSysCyrInformation(SysCyrInformation sysCyrInformation);

    /**
     * 修改承运人实名认证
     * 
     * @param sysCyrInformation 承运人实名认证
     * @return 结果
     */
    public int updateSysCyrInformation(SysCyrInformation sysCyrInformation);

    /**
     * 批量删除承运人实名认证
     * 
     * @param ccountrys 需要删除的承运人实名认证主键集合
     * @return 结果
     */
    public int deleteSysCyrInformationByCcountrys(String[] ccountrys);

    /**
     * 删除承运人实名认证信息
     * 
     * @param ccountry 承运人实名认证主键
     * @return 结果
     */
    public int deleteSysCyrInformationByCcountry(String ccountry);
}

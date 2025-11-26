package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysFyrInformation;

/**
 * 发运人实名认证Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysFyrInformationMapper 
{
    /**
     * 查询发运人实名认证
     * 
     * @param fcountry 发运人实名认证主键
     * @return 发运人实名认证
     */
    public SysFyrInformation selectSysFyrInformationByFcountry(String fcountry);

    /**
     * 查询发运人实名认证列表
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 发运人实名认证集合
     */
    public List<SysFyrInformation> selectSysFyrInformationList(SysFyrInformation sysFyrInformation);

    /**
     * 新增发运人实名认证
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 结果
     */
    public int insertSysFyrInformation(SysFyrInformation sysFyrInformation);

    /**
     * 修改发运人实名认证
     * 
     * @param sysFyrInformation 发运人实名认证
     * @return 结果
     */
    public int updateSysFyrInformation(SysFyrInformation sysFyrInformation);

    /**
     * 删除发运人实名认证
     * 
     * @param fcountry 发运人实名认证主键
     * @return 结果
     */
    public int deleteSysFyrInformationByFcountry(String fcountry);

    /**
     * 批量删除发运人实名认证
     * 
     * @param fcountrys 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysFyrInformationByFcountrys(String[] fcountrys);
}

package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysCustomsDeclaration;

/**
 * 承运人确报Mapper接口
 * 
 * @author ruoyi
 * @date 2025-11-19
 */
public interface SysCustomsDeclarationMapper 
{
    /**
     * 查询承运人确报
     * 
     * @param carrierName 承运人确报主键
     * @return 承运人确报
     */
    public SysCustomsDeclaration selectSysCustomsDeclarationByCarrierName(String carrierName);

    /**
     * 查询承运人确报列表
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 承运人确报集合
     */
    public List<SysCustomsDeclaration> selectSysCustomsDeclarationList(SysCustomsDeclaration sysCustomsDeclaration);

    /**
     * 新增承运人确报
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 结果
     */
    public int insertSysCustomsDeclaration(SysCustomsDeclaration sysCustomsDeclaration);

    /**
     * 修改承运人确报
     * 
     * @param sysCustomsDeclaration 承运人确报
     * @return 结果
     */
    public int updateSysCustomsDeclaration(SysCustomsDeclaration sysCustomsDeclaration);

    /**
     * 删除承运人确报
     * 
     * @param carrierName 承运人确报主键
     * @return 结果
     */
    public int deleteSysCustomsDeclarationByCarrierName(String carrierName);

    /**
     * 批量删除承运人确报
     * 
     * @param carrierNames 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysCustomsDeclarationByCarrierNames(String[] carrierNames);
}

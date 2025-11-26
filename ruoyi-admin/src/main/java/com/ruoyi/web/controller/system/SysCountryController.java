package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.SysCountry;
import com.ruoyi.system.service.ISysCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 国家地区Controller
 * 
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/country")
public class SysCountryController extends BaseController
{
    @Autowired
    private ISysCountryService countryService;

    /**
     * 查询国家地区列表（按洲分组）
     */
    @GetMapping("/list/grouped")
    public AjaxResult getCountryListGrouped()
    {
        Map<String, List<SysCountry>> data = countryService.selectCountryGroupByContinent();
        return success(data);
    }

    /**
     * 查询所有国家地区列表
     */
    @GetMapping("/list")
    public AjaxResult getCountryList()
    {
        List<SysCountry> list = countryService.selectCountryList();
        return success(list);
    }

    /**
     * 根据国家代码获取详细信息
     */
    @GetMapping("/{countryCode}")
    public AjaxResult getCountryByCode(@PathVariable("countryCode") String countryCode)
    {
        return success(countryService.selectCountryByCode(countryCode));
    }
}

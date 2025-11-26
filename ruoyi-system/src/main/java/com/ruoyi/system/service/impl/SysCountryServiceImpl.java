package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysCountry;
import com.ruoyi.system.service.ISysCountryService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 国家地区Service业务层处理
 * 
 * @author ruoyi
 */
@Service
public class SysCountryServiceImpl implements ISysCountryService
{
    private static final List<SysCountry> COUNTRY_DATA = new ArrayList<>();

    static {
        // 亚洲国家
        addCountry("中国", "China", "CN", "+86", "亚洲", 1);
        addCountry("哈萨克斯坦", "Kazakhstan", "KZ", "+7", "亚洲", 2);
        addCountry("吉尔吉斯斯坦", "Kyrgyzstan", "KG", "+996", "亚洲", 3);
        addCountry("塔吉克斯坦", "Tajikistan", "TJ", "+992", "亚洲", 4);
        addCountry("乌兹别克斯坦", "Uzbekistan", "UZ", "+998", "亚洲", 5);
        addCountry("土库曼斯坦", "Turkmenistan", "TM", "+993", "亚洲", 6);
        addCountry("伊朗", "Iran", "IR", "+98", "亚洲", 7);
        addCountry("土耳其", "Turkey", "TR", "+90", "亚洲", 8);
        addCountry("格鲁吉亚", "Georgia", "GE", "+995", "亚洲", 9);
        addCountry("阿塞拜疆", "Azerbaijan", "AZ", "+994", "亚洲", 10);
        // 欧洲国家
        addCountry("白俄罗斯", "Belarus", "BY", "+375", "欧洲", 1);
        addCountry("俄罗斯", "Russia", "RU", "+7", "欧洲", 2);
        addCountry("乌克兰", "Ukraine", "UA", "+380", "欧洲", 3);
        addCountry("芬兰", "Finland", "FI", "+358", "欧洲", 4);
        addCountry("瑞典", "Sweden", "SE", "+46", "欧洲", 5);
        addCountry("丹麦", "Denmark", "DK", "+45", "欧洲", 6);
        addCountry("英国", "United Kingdom", "GB", "+44", "欧洲", 7);
        addCountry("荷兰", "Netherlands", "NL", "+31", "欧洲", 8);
        addCountry("比利时", "Belgium", "BE", "+32", "欧洲", 9);
        addCountry("瑞士", "Switzerland", "CH", "+41", "欧洲", 10);
        addCountry("法国", "France", "FR", "+33", "欧洲", 11);
        addCountry("德国", "Germany", "DE", "+49", "欧洲", 12);
        addCountry("卢森堡", "Luxembourg", "LU", "+352", "欧洲", 13);
        addCountry("拉脱维亚", "Latvia", "LV", "+371", "欧洲", 14);
        addCountry("立陶宛", "Lithuania", "LT", "+370", "欧洲", 15);

    }

    private static void addCountry(String name, String nameEn, String code, String phoneCode, String continent, int order)
    {
        SysCountry country = new SysCountry();
        country.setCountryId((long) order);
        country.setCountryName(name);
        country.setCountryNameEn(nameEn);
        country.setCountryCode(code);
        country.setPhoneCode(phoneCode);
        country.setContinent(continent);
        country.setOrderNum(order);
        country.setStatus("0");
        COUNTRY_DATA.add(country);
    }

    @Override
    public Map<String, List<SysCountry>> selectCountryGroupByContinent()
    {
        return COUNTRY_DATA.stream()
                .filter(country -> "0".equals(country.getStatus()))
                .collect(Collectors.groupingBy(SysCountry::getContinent, LinkedHashMap::new, Collectors.toList()));
    }

    @Override
    public SysCountry selectCountryByCode(String countryCode)
    {
        return COUNTRY_DATA.stream()
                .filter(country -> country.getCountryCode().equals(countryCode))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<SysCountry> selectCountryList()
    {
        return COUNTRY_DATA.stream()
                .filter(country -> "0".equals(country.getStatus()))
                .sorted(Comparator.comparing(SysCountry::getOrderNum))
                .collect(Collectors.toList());
    }
}

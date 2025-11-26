import request from '@/utils/request'

// 查询国家地区列表
export function listCountry() {
  return request({
    url: '/system/country/list',
    method: 'get'
  })
}

// 查询国家地区列表（按洲分组）
export function listCountryGrouped() {
  return request({
    url: '/system/country/list/grouped',
    method: 'get'
  })
}

// 根据国家代码查询
export function getCountryByCode(countryCode) {
  return request({
    url: '/system/country/' + countryCode,
    method: 'get'
  })
}

package com.heavytiger.meowmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.meowmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:48:44
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


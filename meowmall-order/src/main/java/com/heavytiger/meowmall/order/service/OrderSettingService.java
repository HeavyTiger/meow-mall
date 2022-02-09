package com.heavytiger.meowmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.meowmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:29:48
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


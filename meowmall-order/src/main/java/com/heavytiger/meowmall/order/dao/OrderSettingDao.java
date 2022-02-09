package com.heavytiger.meowmall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:29:48
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}

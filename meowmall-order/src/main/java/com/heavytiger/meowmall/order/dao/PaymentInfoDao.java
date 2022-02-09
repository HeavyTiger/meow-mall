package com.heavytiger.meowmall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:29:48
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}

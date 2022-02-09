package com.heavytiger.meowmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:48:44
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}

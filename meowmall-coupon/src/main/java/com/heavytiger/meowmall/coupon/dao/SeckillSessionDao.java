package com.heavytiger.meowmall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.coupon.entity.SeckillSessionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:48:44
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {

}

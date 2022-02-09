package com.heavytiger.meowmall.ware.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.ware.entity.WareSkuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:52:10
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

}

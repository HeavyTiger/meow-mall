package com.heavytiger.meowmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.meowmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-07 22:37:19
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


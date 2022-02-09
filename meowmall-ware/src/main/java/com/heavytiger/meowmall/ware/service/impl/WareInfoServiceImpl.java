package com.heavytiger.meowmall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.common.utils.Query;
import com.heavytiger.meowmall.ware.dao.WareInfoDao;
import com.heavytiger.meowmall.ware.entity.WareInfoEntity;
import com.heavytiger.meowmall.ware.service.WareInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                new QueryWrapper<WareInfoEntity>()
        );

        return new PageUtils(page);
    }

}
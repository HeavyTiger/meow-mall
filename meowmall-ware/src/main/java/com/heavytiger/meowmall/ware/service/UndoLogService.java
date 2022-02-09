package com.heavytiger.meowmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.meowmall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:52:09
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


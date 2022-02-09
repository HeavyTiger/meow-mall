package com.heavytiger.meowmall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heavytiger.meowmall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:50:30
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}

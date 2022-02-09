package com.heavytiger.meowmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.meowmall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:50:30
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.heavytiger.meowmall.member.feign;


import com.heavytiger.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 接口描述如何进行远程调用
 *
 * @author heavytiger
 * @version 1.0
 */
@Service
@FeignClient("meowmall-coupon")
// 表示向注册中心请求"meowmall-coupon"服务
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}

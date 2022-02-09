package com.heavytiger.meowmall.coupon.controller;

import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.common.utils.R;
import com.heavytiger.meowmall.coupon.entity.CouponEntity;
import com.heavytiger.meowmall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券信息
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:48:44
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * 测试OpenFeign远程调用.
     *
     * @return 返回封装数据
     */
    @RequestMapping("/member/list")
    public R memberCoupons() {    // 返回封装数据R
        // 应该去数据库查用户对于的优惠券，简化为构造了一个优惠券给他返回
        CouponEntity ce1 = new CouponEntity();
        CouponEntity ce2 = new CouponEntity();
        ce1.setCouponName("满100减10");   //优惠券的名字
        ce2.setCouponName("满减基础后8折");
        return R.ok().put("coupons", Arrays.asList(ce1, ce2));
    }

    //从application.properties中获取
    @Value("${coupon.user.name}")
    private String name;
    //不要写user.xxx，这是环境里的变量
    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test() {
        return R.ok().put("name", name).put("age", age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id) {
        CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon) {
        couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon) {
        couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids) {
        couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

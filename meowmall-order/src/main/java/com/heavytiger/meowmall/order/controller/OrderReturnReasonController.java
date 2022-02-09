package com.heavytiger.meowmall.order.controller;

import com.heavytiger.common.utils.PageUtils;
import com.heavytiger.common.utils.R;
import com.heavytiger.meowmall.order.entity.OrderReturnReasonEntity;
import com.heavytiger.meowmall.order.service.OrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 退货原因
 *
 * @author heavytiger
 * @email 462857080@qq.com
 * @date 2022-02-08 15:29:48
 */
@RestController
@RequestMapping("order/orderreturnreason")
public class OrderReturnReasonController {
    @Autowired
    private OrderReturnReasonService orderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("order:orderreturnreason:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderReturnReasonService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("order:orderreturnreason:info")
    public R info(@PathVariable("id") Long id) {
        OrderReturnReasonEntity orderReturnReason = orderReturnReasonService.getById(id);

        return R.ok().put("orderReturnReason", orderReturnReason);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("order:orderreturnreason:save")
    public R save(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        orderReturnReasonService.save(orderReturnReason);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("order:orderreturnreason:update")
    public R update(@RequestBody OrderReturnReasonEntity orderReturnReason) {
        orderReturnReasonService.updateById(orderReturnReason);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("order:orderreturnreason:delete")
    public R delete(@RequestBody Long[] ids) {
        orderReturnReasonService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

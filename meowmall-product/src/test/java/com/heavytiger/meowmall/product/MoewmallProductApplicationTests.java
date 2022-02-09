package com.heavytiger.meowmall.product;

import com.heavytiger.meowmall.product.entity.BrandEntity;
import com.heavytiger.meowmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MoewmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setFirstLetter("h");
        brandEntity.setDescript("华为为我增智慧！");
        boolean success = brandService.save(brandEntity);
        System.out.println(success);
    }

}

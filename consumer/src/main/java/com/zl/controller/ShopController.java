package com.zl.controller;


import com.zl.entity.Shop;
import com.zl.service.ShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */

@RestController
public class ShopController {

    @Reference(url = "localhost:20880")
    ShopService shopService;

    @RequestMapping("/list")
    public List<Shop> listAll(){

        return shopService.listAll();
    }
}

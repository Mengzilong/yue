package com.zl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.entity.Shop;
import com.zl.mapper.ShopMapper;
import com.zl.service.ShopService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> listAll() {


        return shopMapper.listAll();
    }
}

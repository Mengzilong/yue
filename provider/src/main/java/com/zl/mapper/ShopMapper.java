package com.zl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zl.entity.Shop;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public interface ShopMapper extends BaseMapper<Shop> {

    public List<Shop> listAll();
}

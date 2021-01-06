package com.zl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zl.entity.Login;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public interface LoginMapper extends BaseMapper<Login> {

    public Login login(String name,String pwd);
}

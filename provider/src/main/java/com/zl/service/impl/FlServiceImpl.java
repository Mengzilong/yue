package com.zl.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.entity.Fl;
import com.zl.mapper.FlMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
@Service
public class FlServiceImpl extends ServiceImpl<FlMapper, Fl> implements IService<Fl> {

}

package com.zl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.entity.Car;
import com.zl.mapper.CarMapper;
import com.zl.mq.Provider;
import com.zl.service.CarService;
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
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Autowired
    Provider provider;

    @Override
    public boolean saveDate(Car car) {

        provider.sendMassage(car);

        return this.save(car);
    }

    @Override
    public List<Car> listCar() {

//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.like("name","name");

        return this.list();
    }
}

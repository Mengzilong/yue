package com.zl.service;

import com.zl.entity.Car;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Kobe
 * @since 2020-12-30
 */
public interface CarService  {

    public boolean saveDate(Car car);

    public List<Car> listCar();
}

package com.zl.controller;


import com.zl.entity.Car;
import com.zl.service.CarService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

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
public class CarController {

    @Reference(url = "localhost:20880")
    CarService carService;

    @PostMapping("/save")
    public boolean saveDate(@RequestBody Car car){

        return carService.saveDate(car);
    }

    @RequestMapping("/listCar")
    public List<Car> listCar(){

        return carService.listCar();
    }
}

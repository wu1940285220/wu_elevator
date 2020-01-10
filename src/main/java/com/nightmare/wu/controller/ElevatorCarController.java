package com.nightmare.wu.controller;

import com.nightmare.wu.entity.ElevatorCar;
import com.nightmare.wu.service.ElevatorCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 15:07
 * @Modified By:
 */
@RestController
public class ElevatorCarController {


    @Autowired
    ElevatorCarService elevatorCarService;

    /**
     * @method: getElevatorCar
     * @description: 根据区域ID获取电梯
     * @author: WuChang
     * @date: 2020-01-09 15:24
     */
    @GetMapping("/getElevatorCar/{regionId}")
    @ResponseBody
    public List<ElevatorCar> getElevatorCar(@PathVariable String regionId){
        return elevatorCarService.getElevatorCarByRegionId(regionId);
    }

    /**
     * @method: updateElevatorCar
     * @description: 模拟电梯
     * @author: WuChang
     * @date: 2020-01-09 15:58
     */
    public boolean updateElevatorCar(){

        String floorAddress= "21";
        boolean action = false; // true 向上 false 向下



        return false;
    }


}

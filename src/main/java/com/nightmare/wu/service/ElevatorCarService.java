package com.nightmare.wu.service;

import com.nightmare.wu.entity.ElevatorCar;

import java.util.List;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 15:12
 * @Modified By:
 */
public interface ElevatorCarService {

    List<ElevatorCar> getElevatorCarByRegionId(String regionId);

}

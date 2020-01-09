package com.nightmare.wu.service.impl;

import com.nightmare.wu.dao.ElevatorCarDao;
import com.nightmare.wu.entity.ElevatorCar;
import com.nightmare.wu.service.ElevatorCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 15:12
 * @Modified By:
 */
@Service
@Transactional
public class ElevatorCarServiceImpl implements ElevatorCarService {


    @Autowired
    ElevatorCarDao elevatorCarDao;

    @Override
    public List<ElevatorCar> getElevatorCarByRegionId(String regionId) {
        return elevatorCarDao.getElevatorCarsByRegionId(regionId);
    }
}

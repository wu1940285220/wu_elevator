package com.nightmare.wu.dao;

import com.nightmare.wu.entity.ElevatorCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 15:10
 * @Modified By:
 */
@Repository
public interface ElevatorCarDao extends JpaRepository<ElevatorCar, Long> {

    /**
     * @method: findElevatorCarsByRegionId
     * @description: 根据区域ID查询电梯
     * @author: WuChang
     * @date: 2020-01-09 15:19
     */
//    @Query("select t from elevator_car t where t.region_id = :regionId ")
    List<ElevatorCar> getElevatorCarsByRegionId(String regionId);

}

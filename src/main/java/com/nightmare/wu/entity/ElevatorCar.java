package com.nightmare.wu.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Author: WuChang
 * @Description:
 * @Date: Created in  2020-01-09 11:40
 * @Modified By:
 */
@Entity
public class ElevatorCar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String direction;
    @Column
    private Integer floor;
    @Column
    private Integer forwardFloor;
    @Column
    private Integer highestFloor;
    @Column
    private Integer lowestFloor;
    @Column
    private String status;
    @Column
    private String regionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getForwardFloor() {
        return forwardFloor;
    }

    public void setForwardFloor(Integer forwardFloor) {
        this.forwardFloor = forwardFloor;
    }

    public Integer getHighestFloor() {
        return highestFloor;
    }

    public void setHighestFloor(Integer highestFloor) {
        this.highestFloor = highestFloor;
    }

    public Integer getLowestFloor() {
        return lowestFloor;
    }

    public void setLowestFloor(Integer lowestFloor) {
        this.lowestFloor = lowestFloor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public String toString() {
        return "ElevatorCar{" +
                "id=" + id +
                ", direction='" + direction + '\'' +
                ", floor=" + floor +
                ", forwardFloor=" + forwardFloor +
                ", highestFloor=" + highestFloor +
                ", lowestFloor=" + lowestFloor +
                ", status=" + status +
                ", regionId='" + regionId + '\'' +
                '}';
    }
}

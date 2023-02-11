package com.groupId.entities;

import com.groupId.entities.enums.UnitsEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

//@Entity
public class SofaTable {

    @Id
    int id;
    float seater_height;
    float back_height_ground;
    float handrest_front_height_ground;
    float handrest_rear_height_ground;
    float handrest_width;
    float outerToOuterDepth;
    UnitsEnum unitsEnum;

}

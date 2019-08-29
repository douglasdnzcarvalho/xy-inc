package com.github.douglasdinizc.xyinc.Models;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interest_points")
public class InterestPoint {

    public InterestPoint(String name, int x_coordinate, int y_coordinate) {
        this.name = name;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Integer x_coordinate;

    @NotNull
    private Integer y_coordinate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(Integer x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public Integer getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(Integer y_coordinate) {
        this.y_coordinate = y_coordinate;
    }
}
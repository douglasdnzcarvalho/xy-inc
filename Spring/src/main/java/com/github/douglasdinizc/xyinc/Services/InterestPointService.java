package com.github.douglasdinizc.xyinc.Services;

import java.util.List;

import com.github.douglasdinizc.xyinc.DAOs.InterestPointDAO;
import com.github.douglasdinizc.xyinc.Models.InterestPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InterestPointService {

    @Autowired
    private InterestPointDAO dao;

    public List<InterestPoint> find(Integer x_coordinate, Integer y_coordinate, Integer max_distance) {
        if (isValid(x_coordinate, y_coordinate, max_distance)) {
            return dao.findByCoordinate(x_coordinate, x_coordinate, max_distance);
        }else{
            return (List<InterestPoint>) dao.findAll();
        }
    }

    public InterestPoint save(InterestPoint ip) {
        if (!isValid(ip.getX_coordinate(), ip.getY_coordinate(), 0)) {
            return null;
        }

        return dao.save(ip);
    }

    private boolean isValid(Integer x_coordinate, Integer y_coordinate, Integer max_distance) {
        if ((x_coordinate != null && x_coordinate < 0) || (y_coordinate != null && y_coordinate < 0) || (max_distance != null && max_distance < 0)) {
            return false;
        }

        return true;
    }
}
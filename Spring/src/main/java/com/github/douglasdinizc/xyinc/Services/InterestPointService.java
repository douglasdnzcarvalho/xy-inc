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

    public List<InterestPoint> findAll() {
        return (List<InterestPoint>) dao.findAll();
    }

    public List<InterestPoint> findByCoordinate(Long x, Long y, Double distancia) {
        return dao.findByCoordinate(x, y, distancia);
    }

    public InterestPoint save(InterestPoint poi) {
        if (!isValid(poi)) {
            return null;
        }

        return dao.save(poi);
    }

    private boolean isValid(InterestPoint poi) {
        if ((poi.getX_coordinate() != null && poi.getX_coordinate() < 0) || (poi.getY_coordinate() != null && poi.getY_coordinate() < 0)) {
            return false;
        }

        return true;
    }
}
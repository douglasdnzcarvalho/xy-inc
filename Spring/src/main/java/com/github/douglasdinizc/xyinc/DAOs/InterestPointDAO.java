package com.github.douglasdinizc.xyinc.DAOs;

import java.util.List;

import javax.transaction.Transactional;

import com.github.douglasdinizc.xyinc.Models.InterestPoint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@Transactional
public interface InterestPointDAO extends CrudRepository<InterestPoint, Long> {

    @Query("select ip from interest_points ip where sqrt( pow((ip.x_coordinate - :x_coordinate), 2) + pow((ip.y_coordinate - :y_coordinate), 2)) <= :max_distance")
    List<InterestPoint> findByCoordinate(@Param("x_coordinate") Integer x, @Param("y_coordinate") Integer y, @Param("max_distance") Integer max_distance);
}
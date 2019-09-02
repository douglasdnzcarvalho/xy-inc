package douglasdinizc.xyinc.repositories;

import douglasdinizc.xyinc.models.InterestPoint;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface InterestPointRepository extends CrudRepository<InterestPoint, Long> {

    @Query(value = "select ip.* from interest_points ip where sqrt( pow((ip.x_coordinate - ?1), 2) + pow((ip.y_coordinate - ?2), 2)) <= ?3", nativeQuery = true)
    List<InterestPoint> findByCoordinates(Integer x, Integer y, Integer max_distance);
}

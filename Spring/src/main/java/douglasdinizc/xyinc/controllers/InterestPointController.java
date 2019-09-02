package douglasdinizc.xyinc.controllers;

import douglasdinizc.xyinc.models.InterestPoint;
import douglasdinizc.xyinc.repositories.InterestPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "interest_points")
public class InterestPointController {

    @Autowired
    private InterestPointRepository IPR;

    @RequestMapping(method = RequestMethod.GET)
    public List<InterestPoint> index(
            @RequestParam(value="x", required = false) Integer x,
            @RequestParam(value="y", required = false) Integer y,
            @RequestParam(value="max_distance", required = false) Integer max_distance
    ) {
        if(
                (x != null && x >= 0) && (y != null && y >= 0) && (max_distance != null && max_distance >= 0)
        ){
            return IPR.findByCoordinates(x, y, max_distance);
        }else{
            return (List<InterestPoint>) IPR.findAll();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public InterestPoint store(@RequestBody InterestPoint ip) {
        return IPR.save(ip);
    }
}

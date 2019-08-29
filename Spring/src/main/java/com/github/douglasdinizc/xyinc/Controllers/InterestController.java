package com.github.douglasdinizc.xyinc.Controllers;

import java.util.List;

import com.github.douglasdinizc.xyinc.Models.InterestPoint;
import com.github.douglasdinizc.xyinc.Services.InterestPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/interest_points")
public class InterestController {

    @Autowired
    private InterestPointService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<InterestPoint> index(@RequestParam(value = "x_coordinate") Integer x_coordinate, @RequestParam(value = "y_coordinate") Integer y_coordinate, @RequestParam(value = "max_distance") Integer max_distance) {
        List<InterestPoint> result = service.find(x_coordinate, y_coordinate, max_distance);

        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public InterestPoint store(@RequestBody InterestPoint ip) {
        return service.save(ip);
    }
}
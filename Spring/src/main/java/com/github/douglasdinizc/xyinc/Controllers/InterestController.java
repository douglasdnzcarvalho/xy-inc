package com.github.douglasdinizc.xyinc.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.github.douglasdinizc.xyinc.Models.InterestPoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/interest_points")
    public InterestPoint greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new InterestPoint(name, 20, 10);
    }
}
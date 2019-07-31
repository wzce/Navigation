package cn.edu.nju.software.course.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dalec
 */
@RestController
@RequestMapping(value="v1/course")
public class CourseController {
    @RequestMapping(value="/{userName}",method = RequestMethod.GET)
    public String hello(@PathVariable("userName") String userName){
        return "Hello " + userName;
    }
}

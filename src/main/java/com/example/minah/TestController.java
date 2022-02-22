package com.example.minah;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path="/test")
    public String getTest(){
        return "test";
    }

    @RequestMapping(method = RequestMethod.PUT, path="/test")
    public String putTest(){
        return "test";
    }

    @RequestMapping(method = RequestMethod.POST, path="/test")
    public String postTest(){
        return "test";
    }

    @RequestMapping(method = RequestMethod.DELETE, path="/test")
    public String deleteTest(){
        return "test";
    }

}

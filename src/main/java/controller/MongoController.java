package controller;

import model.AgencyNews;
import model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.MongoService;

import java.util.List;

@RestController
@RequestMapping("/mongo")
public class MongoController {

    @Autowired
    private MongoService mongoService;

    @GetMapping("/db1")
    public List<Image> getFromDatabase1() {
        return mongoService.getAllFromDatabase1();
    }

    @GetMapping("/db2")
    public List<AgencyNews> getFromDatabase2() {
        return mongoService.getAllFromDatabase2();
    }

    @RequestMapping(method = RequestMethod.GET)
    public HttpStatus health(){
        return HttpStatus.OK;
    }

}

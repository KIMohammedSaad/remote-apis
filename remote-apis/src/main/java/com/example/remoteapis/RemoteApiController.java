package com.example.remoteapis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class RemoteApiController {

    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url = "https://api.themoviedb.org/3/movie/157336?api_key=28c3592f0f0c9e4977ed983787543d40";
        Object responseObject = restTemplate.getForObject(url,Object.class);
        return responseObject;
    }
}

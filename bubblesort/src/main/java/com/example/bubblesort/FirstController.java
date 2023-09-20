package com.example.bubblesort;
import java.sql.SQLException;
import java.util.Map;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FirstController{
    
    @Profile("dev")
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
	return Server.createTcpServer("-tcp","-tcpAllowOthers","-tcpPort","9092");
    }

    @Autowired
    private BubbleRepository bubbleRepository;

    @GetMapping("/")
    public String main(Map<String, Object> model){
    Iterable<Bubble> bubbles = bubbleRepository.findAll();
    model.put("bubbles", bubbles);
    System.out.println("gggd");
    return "home";
    }

    @PostMapping("/")
    public String add(@RequestParam String name, Map<String, Object> model){
    Bubble bubble= new Bubble(name);
    bubbleRepository.save(bubble);
    Iterable<Bubble> bubbles = bubbleRepository.findAll();
    model.put("bubbles", bubbles);
    System.out.println(model);
    return "home";
    }
}
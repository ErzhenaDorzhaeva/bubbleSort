package com.example.bubblesort;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class BubblesortApplication {

@Profile("dev")
@Bean(initMethod = "start", destroyMethod = "stop")
public Server h2Server() throws SQLException {
   return Server.createTcpServer("-tcp","-tcpAllowOthers","-tcpPort","9092");
}
	public static void main(String[] args) {
		SpringApplication.run(BubblesortApplication.class, args);
	}

}

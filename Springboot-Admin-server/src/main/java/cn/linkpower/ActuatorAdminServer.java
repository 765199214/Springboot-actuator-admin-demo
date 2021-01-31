package cn.linkpower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ActuatorAdminServer {
	public static void main(String[] args) {
		try {
			SpringApplication.run(ActuatorAdminServer.class, args);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

package io.gcp.deploy.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class GcpDeploymentStrategiesApplication {
	Logger log = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(GcpDeploymentStrategiesApplication.class, args);
	}

	@Scheduled(fixedDelay = 3000)
	public void printScheduled() {
		log.info("Time is " + System.currentTimeMillis());
	}

}

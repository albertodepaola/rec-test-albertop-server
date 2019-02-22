package co.torre.test.recalbertop.recalbertop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RecAlbertopApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecAlbertopApplication.class, args);
	}

}

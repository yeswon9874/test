package org.tain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tain.utils.CurrentInfo;
import org.tain.utils.Sleep;
import org.tain.yewon.Yewon;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Test02Application implements CommandLineRunner{

	public static void main(String[] args) {
		log.info("YES-20210527 >>>>> {} {}", CurrentInfo.get() , 12345678);
		SpringApplication.run(Test02Application.class, args);
	}
	
	@Autowired
	private Yewon y;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.y.first();
		Sleep.run(5 * 1000);
		
		this.y.second();
		log.info("YEWON-20210527 >>>>> {} {}", CurrentInfo.get());
		
		System.exit(0);
	}

}

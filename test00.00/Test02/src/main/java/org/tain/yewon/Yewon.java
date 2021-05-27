package org.tain.yewon;

import org.springframework.stereotype.Component;
import org.tain.utils.CurrentInfo;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Yewon {

	public void first() {
		log.info("YEWON-20210527 >>>>> {} {}", CurrentInfo.get(), 1234);
	}
	
	public void second() {
		log.info("YEWON-20210527 >>>>> {} {}", CurrentInfo.get(), 5678);
	}
	
}

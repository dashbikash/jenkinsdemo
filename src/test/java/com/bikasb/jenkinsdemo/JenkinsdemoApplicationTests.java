package com.bikasb.jenkinsdemo;

import com.bikash.jenkinsdemo.JenkinsdemoApplication;
import com.bikash.jenkinsdemo.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest(classes =JenkinsdemoApplication.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class JenkinsdemoApplicationTests {
        
        @Autowired
	private MainController controller;
        
	@Test
	void contextLoads() {
            assertThat(controller).isNotNull();
	}

}

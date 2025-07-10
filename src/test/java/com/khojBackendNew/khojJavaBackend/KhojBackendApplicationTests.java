package com.khojBackendNew.khojJavaBackend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = KhojBackendApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ContextConfiguration(classes = KhojBackendApplication.class)
class khojBackendApplicationTest{

	@Test
	void contextLoads() {
	}

}

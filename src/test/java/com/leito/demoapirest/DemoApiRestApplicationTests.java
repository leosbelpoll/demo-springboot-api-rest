package com.leito.demoapirest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApiRestApplicationTests {

	@Test
	void unit_fake_test() {
		Assertions.assertSame("fakeTest", "fakeTest");
	}

}

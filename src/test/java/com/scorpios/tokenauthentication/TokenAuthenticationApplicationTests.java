package com.scorpios.tokenauthentication;

import com.scorpios.tokenauthentication.entity.User;
import com.scorpios.tokenauthentication.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TokenAuthenticationApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = userMapper.getUser("admin","123456");
//		User user = userMapper.getUser(1);
		System.out.println(user);
	}

}


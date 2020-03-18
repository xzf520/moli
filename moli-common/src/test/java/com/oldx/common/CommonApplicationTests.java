package com.oldx.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApplicationTests {

    @Test
    public void contextLoads() {
        String s="moli";
        String aaa=passwordEncoder.encode(s);
        System.out.println(aaa);
      boolean q=  passwordEncoder.matches(aaa,s);
        System.out.println(q);
    }
    private PasswordEncoder passwordEncoder;


}

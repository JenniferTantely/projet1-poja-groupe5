package com.example.demo.service;

import com.example.demo.conf.FacadeIT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

class EnvServiceTest extends FacadeIT {
  @Autowired EnvService subject;

  @Value("${secret.key}")
  String expected;

  @Test
  void get_env_ok() {
    var actual = subject.getSecretKey();
    Assertions.assertEquals(expected, actual);
  }
}

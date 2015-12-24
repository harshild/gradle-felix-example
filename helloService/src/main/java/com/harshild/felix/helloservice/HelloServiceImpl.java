package com.harshild.felix.helloservice;

import org.apache.commons.lang3.text.WordUtils;

public class HelloServiceImpl implements HelloService {
  public String hello() {
    return WordUtils.capitalize("hello world!!!");
  }
}

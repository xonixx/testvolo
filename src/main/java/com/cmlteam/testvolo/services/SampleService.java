package com.cmlteam.testvolo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SampleService {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public SampleService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public String getDbVersion() {
    return jdbcTemplate.queryForObject("select version();", String.class);
  }

//  @PostConstruct
//  public void test() {
//    System.out.println(getDbVersion());
//  }
}

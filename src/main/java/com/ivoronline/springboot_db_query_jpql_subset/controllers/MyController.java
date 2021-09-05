package com.ivoronline.springboot_db_query_jpql_subset.controllers;

import com.ivoronline.springboot_db_query_jpql_subset.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN SCALAR
  //================================================================
  // 20
  @RequestMapping("ReturnScalar")
  Integer returnScalar() {
    Integer age = personRepository.returnScalar();
    return  age;
  }

  //================================================================
  // RETURN STRING
  //================================================================
  @RequestMapping("ReturnString")
  String returnString() {
    String personName = personRepository.returnString();
    return personName;
  }

}

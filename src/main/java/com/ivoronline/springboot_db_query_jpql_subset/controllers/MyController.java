package com.ivoronline.springboot_db_query_jpql_subset.controllers;

import com.ivoronline.springboot_db_query_jpql_subset.dto.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_subset.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON STRING
  //================================================================
  @RequestMapping("ReturnPersonString")
  String returnPersonString() {
    String personName = personRepository.returnPersonString();
    return personName;
  }


}

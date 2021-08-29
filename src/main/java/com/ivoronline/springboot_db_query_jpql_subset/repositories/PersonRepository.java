package com.ivoronline.springboot_db_query_jpql_subset.repositories;

import com.ivoronline.springboot_db_query_jpql_subset.dto.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_subset.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // SOME PROPERTIES AS STRING
  //=======================================================================================
  //RETURNS STRING: John,20
  @Query(value = "SELECT john.name, john.age FROM Person john WHERE john.name = 'John' AND john.age = 20")
  String somePropertiesAsString();

  //=======================================================================================
  // SOME PROPERTIES AS DTO
  //=======================================================================================
  //Needs fully qualified DTO name. Imports are not used.
  @Query(value = "" +
    "SELECT new com.ivoronline.springboot_db_query_jpql_subset.dto.PersonDTO(john.name, john.age) " +
    "FROM   Person john " +
    "WHERE  john.name = 'John' " +
    "AND    john.age  = 20"
  )
  PersonDTO somePropertiesAsDTO();

}

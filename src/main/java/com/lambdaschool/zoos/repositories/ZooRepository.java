package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long>
{
    @Modifying
    @Query(value = "UPDATE roles " +
            "SET name = :name, " +
            "last_modified_date = CURRENT_TIMESTAMP " +
            "last_modified_by = : uname " +
            "WHERE animalid = :animalid", nativeQuery = true)
    void updatedAnimalName(long animalid, String name, String uname);
}

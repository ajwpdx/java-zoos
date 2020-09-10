package com.lambdaschool.zoos.repositories;

import com.lambdaschool.zoos.models.ZooAnimalId;
import com.lambdaschool.zoos.models.ZooAnimals;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalsRepository extends CrudRepository<ZooAnimals, ZooAnimalId>
{
}

package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;

public interface AnimalService
{
    Animal update(long id, Animal animal);
}

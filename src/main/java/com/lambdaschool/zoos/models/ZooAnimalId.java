package com.lambdaschool.zoos.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ZooAnimalId implements Serializable
{
    private long zoo;

    private long animal;

    public ZooAnimalId()
    {

    }

    public ZooAnimalId(long zoo, long animal)
    {
        this.zoo = zoo;
        this.animal = animal;
    }

    public long getZoo()
    {
        return zoo;
    }

    public void setZoo(long zoo)
    {
        this.zoo = zoo;
    }

    public long getAnimal()
    {
        return animal;
    }

    public void setAnimal(long animal)
    {
        this.animal = animal;
    }
}

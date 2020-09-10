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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimalId that = (ZooAnimalId) o;
        return this.zoo == that.zoo &&
                this.animal == that.animal;
    }

    @Override
    public int hashCode() {
        //if objects generate different hash codes, they are not equal. Then if they do not pass this test, they will go to the equals method.
        // We are putting in 37 to make it go straight to the equals
        return 37;
    }
}

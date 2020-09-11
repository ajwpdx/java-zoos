package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import com.lambdaschool.zoos.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    AnimalRepository animalrepos;




    @Transactional
    @Override
    public AnimalService update(long id, Animal animal)
    {
        if(animal.getAnimaltype() == null)
        {
            throw new EntityNotFoundException("No animal type found to update!")
        }

        if(animal.getUsers().size() > 0)
        {
            throw new EntityExistsException("User Roles are not update through this method");
        }

        Animal newRole = findAnimalById(id);

        rolerepos.updateRoleName(id, role.getName(), userauditing.getCurrentAuditor().get());
        return findRoleById(id);
}

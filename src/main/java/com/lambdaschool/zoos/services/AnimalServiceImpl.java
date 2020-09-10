package com.lambdaschool.zoos.services;

import com.lambdaschool.zoos.models.Animal;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

public interface AnimalServiceImpl
{

    @Transactional
    @Override
    public AnimalService update(long id, Animal animal)
    {
        if(animal.getAnimaltype() == null)
        {
            throw new EntityNotFoundException("No role name found to update!")
        }

        if(animal.getUsers().size() > 0)
        {
            throw new EntityExistsException("User Roles are not update through this method");
        }

        Animal newRole = findAnimalById(id);

        rolerepos.updateRoleName(id, role.getName(), userauditing.getCurrentAuditor().get());
        return findRoleById(id);
}

package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface ReadById <ID, Entity>{

    public Entity readById(ID id);
}

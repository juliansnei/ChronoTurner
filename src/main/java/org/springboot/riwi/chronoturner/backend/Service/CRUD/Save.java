package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface Save<Entity,EntityDTO>{
    public Entity save(EntityDTO entity);
}

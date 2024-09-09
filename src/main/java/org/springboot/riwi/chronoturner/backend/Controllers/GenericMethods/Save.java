package org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods;

public interface Save<Entity,EntityDTO>{
    public Entity save(EntityDTO entity);
}

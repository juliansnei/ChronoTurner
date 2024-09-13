package org.springboot.riwi.chronoturner.backend.Service.CRUD;

public interface Create<EntityRequest,Entity>{

    public Entity create(EntityRequest request);

}

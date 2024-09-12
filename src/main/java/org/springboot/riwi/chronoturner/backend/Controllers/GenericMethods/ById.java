package org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods;

import org.springframework.http.ResponseEntity;

public interface ById<ID, Entity> {

    public ResponseEntity<Entity> ById(ID id);
}

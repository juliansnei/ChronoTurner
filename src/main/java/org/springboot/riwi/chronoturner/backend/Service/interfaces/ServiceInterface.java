package org.springboot.riwi.chronoturner.backend.Service.interfaces;

import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.User;
import org.springboot.riwi.chronoturner.backend.Service.CRUD.Save;

public interface ServiceInterface extends Save<User, UserRequestDTO>{
}

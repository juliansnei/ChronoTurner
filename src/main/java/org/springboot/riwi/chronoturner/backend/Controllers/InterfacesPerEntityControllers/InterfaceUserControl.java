package org.springboot.riwi.chronoturner.backend.Controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods.Save;
import org.springboot.riwi.chronoturner.backend.dtos.request.UserRequestDTO;
import org.springboot.riwi.chronoturner.backend.entities.User;

public interface InterfaceUserControl extends Save<User, UserRequestDTO> {
}

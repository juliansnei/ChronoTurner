package org.springboot.riwi.chronoturner.backend.Controllers.InterfacesPerEntityControllers;

import org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods.Create;
import org.springboot.riwi.chronoturner.backend.Controllers.GenericMethods.ById;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;

public interface InterfaceGoalControl extends
        Create<GoalRequest, Goal>,
        ById<String, GoalResponse> {
}

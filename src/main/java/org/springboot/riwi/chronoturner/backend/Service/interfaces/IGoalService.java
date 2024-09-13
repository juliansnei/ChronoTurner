package org.springboot.riwi.chronoturner.backend.Service.interfaces;

import org.springboot.riwi.chronoturner.backend.Service.CRUD.Create;
import org.springboot.riwi.chronoturner.backend.Service.CRUD.ReadById;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;

import java.util.Optional;

public interface IGoalService extends
        ReadById<String, Optional<GoalResponse>>,
        Create<GoalRequest, Goal> {

}

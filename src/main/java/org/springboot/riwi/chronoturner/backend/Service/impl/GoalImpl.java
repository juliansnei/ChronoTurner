package org.springboot.riwi.chronoturner.backend.Service.impl;

import org.springboot.riwi.chronoturner.backend.Repository.GoalRepository;
import org.springboot.riwi.chronoturner.backend.Service.interfaces.IGoalService;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GoalImpl implements IGoalService {

    @Autowired
    GoalRepository goalRepository;


    @Override
    public Goal create(GoalRequest goalDTO) {


        //DTO --> entidad

        Goal request = new Goal().builder().name(goalDTO.getName())
                .description(goalDTO.getDescription())
                .startDate(goalDTO.getStartDate())
                .endDate(goalDTO.getEndDate())
                .build();


        return goalRepository.save(request);
    }


    @Override
    public Optional<GoalResponse> readById(String id) {

        // mapeo entidad -> Entidad de respuesta



        return goalRepository.findById(id).map(goal-> new GoalResponse().builder()
                .name(goal.getName())
                .description(goal.getDescription())
                .startDate(goal.getStartDate())
                .endDate(goal.getEndDate())
                .status(goal.getStatus())
                .build()) ;
    }
}

package org.springboot.riwi.chronoturner.backend.Controllers.ImpleControllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springboot.riwi.chronoturner.backend.Controllers.InterfacesPerEntityControllers.InterfaceGoalControl;

import org.springboot.riwi.chronoturner.backend.Service.interfaces.IGoalService;
import org.springboot.riwi.chronoturner.backend.dtos.exception.NoUserIdException;
import org.springboot.riwi.chronoturner.backend.dtos.request.GoalRequest;
import org.springboot.riwi.chronoturner.backend.dtos.response.GoalResponse;
import org.springboot.riwi.chronoturner.backend.entities.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.ServiceUnavailableException;
import java.net.SocketTimeoutException;



@RestController
@RequestMapping("/goals")
@Tag(name="Goals")
public class GoalController implements InterfaceGoalControl {


    @Autowired
    IGoalService goalService;

    private boolean maintenanceMode = false; // Simulación del modo de mantenimiento

    public GoalController(IGoalService goalService) {
        this.goalService = goalService;
    }

    @Override
    @PostMapping
    public ResponseEntity<Goal> create(@RequestBody  @Valid GoalRequest goal) throws ServiceUnavailableException {
        if (maintenanceMode) {
            throw new ServiceUnavailableException("El servidor está en mantenimiento. Por favor, inténtelo más tarde.");
        }
        return ResponseEntity.ok(goalService.create(goal));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<GoalResponse> ById(@PathVariable String id) {

        GoalResponse goalResponse = goalService.readById(id).orElseThrow(()->new NoUserIdException("Este usuario no existe"));

        return ResponseEntity.ok(goalResponse);
    }

    // error de tiempo, borrar
    @PostMapping("/test-timeout")
    public ResponseEntity<String> testTimeout() throws SocketTimeoutException {
        throw new SocketTimeoutException("Simulated timeout exception");
    }

}

package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingController {

    @Autowired
    private ImplITrainingService trainingService;

    @GetMapping("/trainings")
    public List<Training> allTrainings(){
        System.out.println(trainingService.getAllTrainings());
        return trainingService.getAllTrainings();
    }
}

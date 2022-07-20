package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TrainingController {

    @Autowired
    private ImplITrainingService trainingService;

    @GetMapping("/trainings")
    public List<Training> allTrainings(){
        return trainingService.getAllTrainings();
    }

    @PostMapping("/trainings")
    public Training saveTraining(@RequestBody Training t){
        return trainingService.saveTraining(t);
    }

    @DeleteMapping("/trainings/{id}")
    public void deleteTraining(@PathVariable("id")Long id){
        trainingService.deleteTraining(id);
    }

    @GetMapping("/trainings/{id}")
    public ResponseEntity<Training>getTrainingById(@PathVariable("id")Long id){
        Optional<Training> training=trainingService.readTraining(id);
        if (training.isPresent()){
            return new ResponseEntity<>(training.get(), HttpStatus.OK);
            }
            return null;
        }

}

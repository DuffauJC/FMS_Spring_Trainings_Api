package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import fr.fms.FMS_Spring_Trainings_Api.Exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Training getTrainingById(@PathVariable("id")Long id){
        Optional<Training> training=trainingService.readTraining(id);

        if (training.isPresent()){
            return training.get();
            }else{
         throw new RecordNotFoundException("Id de la formation "+ id +"n'existe pas");
        }

        }

}

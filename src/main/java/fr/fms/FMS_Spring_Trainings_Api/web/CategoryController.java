package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Category;
import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private ImplITrainingService trainingService;

    @GetMapping("/categories")
    public List<Category> allTCategories(){
        return trainingService.getAllCategories();
    }


   @GetMapping("/trainingsByCategory/{id}")
    public List<Training> getTrainingsByCategoryId(@PathVariable("id")Long id){
    return trainingService.getTrainingsByCategoryId(id);

       }

}
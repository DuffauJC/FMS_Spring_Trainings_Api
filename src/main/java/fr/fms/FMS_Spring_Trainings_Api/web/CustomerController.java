package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Customer;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ImplITrainingService trainingService;


    @GetMapping("/customer/{mail}")
    public Customer getTrainingsByCategoryId(@PathVariable("mail") String mail) {
        return trainingService.getCustomerByMail(mail).get();

    }

}
package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Orders;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OrdersController {

    @Autowired
    private ImplITrainingService trainingService;


    @PostMapping ("/orders")
    public Orders saveOrders(@RequestBody Orders o){

        return trainingService.saveOrder(o);
    }

}
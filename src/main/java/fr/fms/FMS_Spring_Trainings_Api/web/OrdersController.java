package fr.fms.FMS_Spring_Trainings_Api.web;

import fr.fms.FMS_Spring_Trainings_Api.entities.Orders;
import fr.fms.FMS_Spring_Trainings_Api.entities.OrdersItem;
import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import fr.fms.FMS_Spring_Trainings_Api.service.ImplITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping ("/ordersItem")
    public OrdersItem saveOrdersItem(@RequestBody OrdersItem oi){
        return trainingService.saveOrdersItem(oi);
    }
    @GetMapping("/ordersById/{id}")
    public Orders getOrdersByCustomerId(@PathVariable("id")Long id){
        return trainingService.getOrdersById(id).get();
    }
    @GetMapping("/ordersItemByOrder/{id}")
    public List<OrdersItem> getOrdersItemByOrderId(@PathVariable("id")Long id){
        return trainingService.getOrdersItemsByOrderId(id);

    }

}
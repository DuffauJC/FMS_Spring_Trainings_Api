package fr.fms.FMS_Spring_Trainings_Api.service;

import fr.fms.FMS_Spring_Trainings_Api.dao.*;
import fr.fms.FMS_Spring_Trainings_Api.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplITrainingService implements ITrainingService{

    @Autowired
    TrainingRepository trainingRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderItemRepository orderItemRepository;

    @Override
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    /**
     * @param t
     * @return
     */
    @Override
    public Training saveTraining(Training t) {
        return trainingRepository.save(t);
    }

    /**
     * @param t
     * @return
     */
    @Override
    public Training updateTraining(Training t) {
        return trainingRepository.save(t);
    }

    /**
     * @param id
     */
    @Override
    public void deleteTraining(Long id) {
        trainingRepository.deleteById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Training> readTraining(Long id) {
        return trainingRepository.findById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Category> readCategory(Long id) {
        return categoryRepository.findById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<Training> getTrainingsByCategoryId(Long id) {
        return trainingRepository.findTrainingsByCategoryId(id);
    }

    /**
     * @param mail
     * @return
     */
    @Override
    public Optional<Customer> getCustomerByMail(String mail) {
        return customerRepository.findByMail(mail);
    }

    /**
     * @param o
     * @return
     */
    @Override
    public Orders saveOrder(Orders o) {

        return orderRepository.save(o);
    }

    /**
     * @param oi
     * @return
     */
    @Override
    public OrdersItem saveOrdersItem(OrdersItem oi) {
        return orderItemRepository.save(oi);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Orders> getOrdersById(Long id) {
        return orderRepository.findById(id);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<OrdersItem> getOrdersItemsByOrderId(Long id) {
        return orderItemRepository.findOrdersItemByOrdersId(id);
    }
}

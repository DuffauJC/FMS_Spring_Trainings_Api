package fr.fms.FMS_Spring_Trainings_Api.service;

import fr.fms.FMS_Spring_Trainings_Api.dao.CategoryRepository;
import fr.fms.FMS_Spring_Trainings_Api.dao.CustomerRepository;
import fr.fms.FMS_Spring_Trainings_Api.dao.TrainingRepository;
import fr.fms.FMS_Spring_Trainings_Api.entities.Category;
import fr.fms.FMS_Spring_Trainings_Api.entities.Customer;
import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
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
}

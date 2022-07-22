package fr.fms.FMS_Spring_Trainings_Api.service;

import fr.fms.FMS_Spring_Trainings_Api.entities.Category;
import fr.fms.FMS_Spring_Trainings_Api.entities.Customer;
import fr.fms.FMS_Spring_Trainings_Api.entities.Training;

import java.util.List;
import java.util.Optional;

public interface ITrainingService {
// trainings
    public List<Training> getAllTrainings();

   public Training saveTraining(Training t);

   public void deleteTraining(Long id);

   public Optional<Training> readTraining(Long id);

//   categories
    public List<Category> getAllCategories();

    public List<Training> getTrainingsByCategoryId(Long id);

    // customer
    public Optional<Customer> getCustomerByMail(String mail);
}

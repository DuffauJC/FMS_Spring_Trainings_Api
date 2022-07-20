package fr.fms.FMS_Spring_Trainings_Api.service;

import fr.fms.FMS_Spring_Trainings_Api.entities.Training;

import java.util.List;
import java.util.Optional;

public interface ITrainingService {

    public List<Training> getAllTrainings();

   public Training saveTraining(Training t);

   public void deleteTraining(Long id);

   public Optional<Training> readTraining(Long id);
}

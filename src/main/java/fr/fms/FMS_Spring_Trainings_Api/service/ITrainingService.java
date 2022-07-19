package fr.fms.FMS_Spring_Trainings_Api.service;

import fr.fms.FMS_Spring_Trainings_Api.entities.Training;

import java.util.List;

public interface ITrainingService {

    public List<Training> getAllTrainings();
}

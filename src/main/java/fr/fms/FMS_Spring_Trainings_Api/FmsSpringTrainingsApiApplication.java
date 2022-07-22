package fr.fms.FMS_Spring_Trainings_Api;

import fr.fms.FMS_Spring_Trainings_Api.dao.CategoryRepository;
import fr.fms.FMS_Spring_Trainings_Api.dao.CustomerRepository;
import fr.fms.FMS_Spring_Trainings_Api.dao.TrainingRepository;
import fr.fms.FMS_Spring_Trainings_Api.entities.Category;
import fr.fms.FMS_Spring_Trainings_Api.entities.Customer;
import fr.fms.FMS_Spring_Trainings_Api.entities.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FmsSpringTrainingsApiApplication implements CommandLineRunner {

    @Autowired
    private TrainingRepository trainingRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FmsSpringTrainingsApiApplication.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

//	Category Front = categoryRepository.save(new Category(null,"Front","Technos en lien avec l'utilisateur"));
//	Category Back = categoryRepository.save(new Category(null,"Back","Langages coté serveur"));
//	Category Versionning = categoryRepository.save(new Category(null,"Versionning","Pour être à jour et ne rien perdre"));
//
//	trainingRepository.save(new Training(null,"Java-bien","Formation Java SE 8 sur 5 jours",2800,1,"assets/img/java.png",Back));
//	trainingRepository.save(new Training(null,"DotNet","Formation JDotNet sur 3 jours",1000,1,"assets/img/visual-basic.png",Back));
//	trainingRepository.save(new Training(null,"Python","Formation Python/Django 5 jours",1500,1,"assets/img/python.png",Back));
//	trainingRepository.save(new Training(null,"Php","Initiation au Dev/Web 4 jours",1300,1,"assets/img/php.png",Back));
//	trainingRepository.save(new Training(null,"NodeJs","Formation NodeJs/Express 2 jours",1400,1,"assets/img/nodejs.png",Back));
//	trainingRepository.save(new Training(null,"Java avancé","Formation avancé 2 jours",1200,1,"assets/img/java.png",Back));
//	trainingRepository.save(new Training(null,"React","Formation React/Front 12 jours",1200,1,"assets/img/react.png",Front));
//	trainingRepository.save(new Training(null,"Github","Formation Git/Github 10 jours",1600,1,"assets/img/github.png",Versionning));
//	trainingRepository.save(new Training(null,"Javascript","Formation d'une vie",1600,1,"assets/img/js.png",Front));

        //customerRepository.save(new Customer(null,"jcd@fr","MjV0eTUw","Duffau","Jean-Charles","887 rte","0605","admin"));
        // customerRepository.save(new Customer(null,"rabbit@free.fr","YXE0NTg4","Rabbit","Roger","25, rue de la carotte","4578","customer"));
    }
}


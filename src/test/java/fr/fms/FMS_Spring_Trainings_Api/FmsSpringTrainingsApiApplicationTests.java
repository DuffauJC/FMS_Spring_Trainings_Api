package fr.fms.FMS_Spring_Trainings_Api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FmsSpringTrainingsApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testGetTrainingsAndTestName()throws Exception{

		mockMvc.perform(get("/api/trainings"))
				.andExpect(status().isOk())
				.andExpect((ResultMatcher) jsonPath("$[0].name",is("Java-bien")));
	}

}

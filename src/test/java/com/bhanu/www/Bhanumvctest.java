package com.bhanu.www;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(value=Bhanumvc.class)
public class Bhanumvctest {
	
	@Autowired
	private MockMvc mockmvc;
	

	   @Test
	    public void testGetHome() throws Exception {
	        // Perform GET request
	        MvcResult result = mockmvc.perform(get("/Get"))
	                .andExpect(status().isOk())
	                .andReturn();

	        // Assert the response content
	        String expectedContent = "Hello Bhanu get deployed Successfully";
	        String actualContent = result.getResponse().getContentAsString();
	        Assertions.assertEquals(expectedContent, actualContent);
	    }

}

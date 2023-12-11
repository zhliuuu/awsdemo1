package com.example.demo3;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

class OrderControllerTest {

    @Test
    void testOrderEndpoint1() throws Exception {
        // Create an instance of OrderController
        OrderController orderController = new OrderController();

        // Set up the MockMvc for testing
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(orderController).build();

        // Perform a GET request to "/test1" and expect the response to be "order123"
        mockMvc.perform(MockMvcRequestBuilders.get("/order/test1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("order123"));
    }
}


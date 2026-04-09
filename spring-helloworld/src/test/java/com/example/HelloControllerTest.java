package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void index_returnsOkAndIndexView() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    void index_modelContainsMessage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(model().attributeExists("message"))
                .andExpect(model().attribute("message", "Hello, World!"));
    }

    @Test
    void index_modelContainsDice() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(model().attributeExists("dice"));
    }
}

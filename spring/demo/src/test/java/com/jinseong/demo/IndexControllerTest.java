package com.jinseong.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class IndexControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void index_test() throws Exception {
        ResultActions resultActions = mvc.perform(get("/index"));
        // ResultActions resultActions =
        // mvc.perform(MockMvcRequestBuilders.get("/index"));

        resultActions.andExpect(status().isOk()); // alt+shift+o
        assertThat(status().isOk());
        assertThat("기대하는값").isEqualTo("기대하는값");
    }

    @Test
    public void test() throws Exception{
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> newList = list.stream().map((e)-> e+1).collect(Collectors.toList());
        
        newList.stream().forEach((e)->{
            System.out.print(e + "\t");
        });
    }
}
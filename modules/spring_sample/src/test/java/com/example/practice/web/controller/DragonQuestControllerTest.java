package com.example.practice.web.controller;

import com.example.practice.web.bean.Job;
import com.example.practice.web.service.DragonQuestService;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * {@link DragonQuestController} のテスト
 * @since 2017/10/22
 */
public class DragonQuestControllerTest {

    private MockMvc mockMvc;

    @Tested(availableDuringSetup = true)
    private DragonQuestController sut;

    @Injectable
    private DragonQuestService service;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(sut)
                .build();
    }

    @Test
    public void 職業のリストを取得する() throws Exception {

        Job j = new Job();
        j.setId(1);
        j.setName("戦士");

        new Expectations(){{
            service.getJobs();
            result = Arrays.asList(j);
        }};

        mockMvc.perform(get("/draque/jobs").contentType(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value("1"))
                .andExpect(jsonPath("$[0].name").value("戦士"))
                .andReturn();
    }
}
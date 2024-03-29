package com.marco.UserAuthExercise.controller;

import com.marco.UserAuthExercise.domain.User;
import com.marco.UserAuthExercise.role.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DashboardControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        @WithMockUser(username = "user", authorities = "admin:read")
        void testAuthorizedAccessToDashboard() throws Exception {
                mockMvc.perform(get("/dashboard"))
                        .andExpect(status().isOk());
        }

        @Test
        @WithMockUser(username = "admin", roles = "ADMIN")
        public void testUnauthorizedAccessToDashboard() throws Exception {
                mockMvc.perform(get("/dashboard"))
                        .andExpect(status().isForbidden());
        }
}

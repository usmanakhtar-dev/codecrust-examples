package com.codecrust.employee.controllers

import org.hamcrest.CoreMatchers.containsString
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureStubRunner(
    ids = ["com.codecrust:department:+:stubs:8100"],
    stubsMode = StubRunnerProperties.StubsMode.LOCAL
)
class EmployeeControllerContractTests {

    @Autowired
    private val mockMvc: MockMvc? = null

    @Test
    @Throws(Exception::class)
    fun shouldReturnDefaultMessage() {
        mockMvc!!.perform(
            get("/employee/employee-1")
        )
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("{\"id\":\"employee-id\",\"name\":\"John\",\"department\":\"Sales\"}")))
    }
}
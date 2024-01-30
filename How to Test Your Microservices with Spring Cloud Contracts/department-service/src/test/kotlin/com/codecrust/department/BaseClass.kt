package com.codecrust.department

import com.codecrust.department.controllers.DepartmentController
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [DepartmentApplication::class])
abstract class BaseClass {
    @Autowired
    var departmentController: DepartmentController? = null

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(departmentController)
    }
}
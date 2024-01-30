package com.codecrust.employee.controller

import com.codecrust.employee.models.EmployeeResponse
import com.codecrust.employee.services.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController(val service: EmployeeService) {

    @GetMapping("/employee/{employeeId}")
    fun getEmployeeById(@PathVariable employeeId: String): EmployeeResponse {
        return service.getEmployeeById(employeeId)
    }

}
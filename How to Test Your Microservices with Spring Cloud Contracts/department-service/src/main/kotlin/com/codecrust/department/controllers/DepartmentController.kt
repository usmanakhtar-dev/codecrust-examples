package com.codecrust.department.controllers

import com.codecrust.department.models.DepartmentResponse
import com.codecrust.department.services.DepartmentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DepartmentController(val service: DepartmentService) {

    @GetMapping("/department/{employeeId}")
    fun getDepartmentByEmployeeId(@PathVariable employeeId: String): DepartmentResponse {
        return service.getDepartmentByEmployeeId(employeeId)
    }
}
package com.codecrust.department.services

import com.codecrust.department.models.DepartmentResponse
import org.springframework.stereotype.Service

@Service
class DepartmentService {

    fun getDepartmentByEmployeeId(employeeId: String): DepartmentResponse {
        return DepartmentResponse(
            id = "department-1",
            name = "Sales"
        )
    }
}
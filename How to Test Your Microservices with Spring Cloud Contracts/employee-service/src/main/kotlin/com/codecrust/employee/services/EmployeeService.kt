package com.codecrust.employee.services

import com.codecrust.employee.models.DepartmentResponse
import com.codecrust.employee.models.EmployeeResponse
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class EmployeeService(val restTemplate: RestTemplate) {

    fun getEmployeeById(id: String): EmployeeResponse {
        val httpHeaders = HttpHeaders()
        httpHeaders.add("Content-Type", "application/json")
        val requestEntity = HttpEntity<Void>(httpHeaders)

        val responseEntity: ResponseEntity<DepartmentResponse> = restTemplate.exchange(
            "http://localhost:8080/department/$id",
            HttpMethod.GET,
            requestEntity,
            DepartmentResponse::class.java
        )

        return EmployeeResponse(
            id="employee-id",
            name = "John",
            department = responseEntity.body!!.name
        )
    }
}
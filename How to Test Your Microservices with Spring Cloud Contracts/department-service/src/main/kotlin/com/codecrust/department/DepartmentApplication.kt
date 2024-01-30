package com.codecrust.department

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DepartmentApplication

fun main(args: Array<String>) {
	runApplication<DepartmentApplication>(*args)
}

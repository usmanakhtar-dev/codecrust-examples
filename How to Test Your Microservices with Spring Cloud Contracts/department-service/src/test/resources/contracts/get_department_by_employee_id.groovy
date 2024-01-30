package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return sales department by employeeId employee-1"

    request {
        url "/department/employee-1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                id: "department-1",
                name: "Sales",
        )
    }
}
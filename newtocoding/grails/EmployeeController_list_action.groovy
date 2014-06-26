package grails_demo

class EmployeeController {

    static defaultAction = "list"

    def list() {
        List x = Employee.list()
        Map m = [employees: x]

        return m
    }
}
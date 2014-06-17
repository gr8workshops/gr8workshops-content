def show() {
    Employee employee = Employee.get(params.id)
    Map m = [name: employee.name, title: employee.title, age: employee.age]

    return m
}

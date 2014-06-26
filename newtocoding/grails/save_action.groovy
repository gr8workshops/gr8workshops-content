def save() {
    Employee employee = new Employee()
    employee.name = params.name
    employee.title = params.title
    employee.age = params.age.toInteger()
    employee = employee.save()

    Map m = [action: "show", params: [id: employee.id]]
    redirect(m)
}


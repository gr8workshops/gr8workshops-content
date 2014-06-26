<html>
<head>
    <title>List the Employees</title>
</head>

<body>
<g:link action="create">Create Employee</g:link>
<h1>These are the employees!</h1>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
    </tr>
    <g:each in="${employees}" var = "employee">
        <tr>
            <td>${employee.id}</td>
            <td><g:link action="show" id="${employee.id}">${employee.name}</g:link></td>
        </tr>
    </g:each>
</table>
</body>
</html>

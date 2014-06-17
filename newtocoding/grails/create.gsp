<html>
<head>
    <title>Create an employee</title>
</head>

<body>
    <g:link action="list">Employees</g:link>
    <br/>
    <h1>This Employee's information:</h1>
    <g:form>
        <table>
            <tr>
                <td>Name:</td>
                <td><g:textField name="name"></g:textField></td>
            </tr>
            <tr>
                <td>Title:</td>
                <td><g:textField name="title"></g:textField></td>
            </tr>
            <tr>
                <td>Age:</td>
                <td><g:textField name="age"></g:textField></td>
            </tr>
        </table>
        <g:actionSubmit value="Save" action="save"></g:actionSubmit>
    </g:form>
</body>
</html>

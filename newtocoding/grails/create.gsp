<html>
<head>
    <title>Create a sandwich</title>
</head>

<body>
<g:link action="list">Sandwiches</g:link>
<br/>
<h1>This Sandwich's details:</h1>
<g:form>
    <table>
        <tr>
            <td>Name:</td>
            <td><g:textField name="name"></g:textField></td>
        </tr>
        <tr>
            <td>Slices of bread:</td>
            <td><g:textField name="breadSlices"></g:textField></td>
        </tr>
        <tr>
            <td>Tomatoes:</td>
            <td><g:textField name="tomatoes"></g:textField></td>
        </tr>
        <tr>
            <td>Type of meat:</td>
            <td><g:textField name="meat"></g:textField></td>
        </tr>
    </table>
    <g:actionSubmit value="Save" action="save"></g:actionSubmit>
</g:form>
</body>
</html>
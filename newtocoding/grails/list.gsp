<html>
<head>
    <title>List the Sandwiches</title>
</head>

<body>
<g:link action="create">Create Sandwich</g:link>
<h1>These are the sandwiches!</h1>
<table>
    <tr>
        <td>ID</td>
        <td>Name</td>
    </tr>
    <g:each in="${sandwiches}" var = "sandwich">
        <tr>
            <td>${sandwich.id}</td>
            <td><g:link action="show" id="${sandwich.id}">${sandwich.name}</g:link></td>
        </tr>
    </g:each>
</table>
</body>
</html>

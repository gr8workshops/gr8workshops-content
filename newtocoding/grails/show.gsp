<html>
<head>
    <title>${name}</title>
</head>

<body>
<g:link action="list">Sandwiches</g:link>
<br>
<g:link action="create">Create Sandwich</g:link>
<table>
    <tr>
        <td>Name:</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Slices of bread:</td>
        <td>${breadSlices}</td>
    </tr>
    <tr>
        <td>Tomatoes:</td>
        <td>${tomatoes}</td>
    </tr>
    <tr>
        <td>Type of meat:</td>
        <td>${meat}</td>
    </tr>
</table>
</body>
</html>
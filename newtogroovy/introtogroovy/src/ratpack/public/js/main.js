document.addEventListener('DOMContentLoaded', function(){
    console.log('document is ready. I can sleep now');
    var resultBox = document.getElementById('result');
    var code = document.getElementById('code').innerText;

    document.getElementById('codeRunner').addEventListener('click', function() {
        console.log('running...');
        console.log(code.toString());
        var xmlhttp = new XMLHttpRequest();   // new HttpRequest instance
        xmlhttp.open("POST", "/eval");
        xmlhttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
        xmlhttp.send(code);
        console.log('done');
    });
});

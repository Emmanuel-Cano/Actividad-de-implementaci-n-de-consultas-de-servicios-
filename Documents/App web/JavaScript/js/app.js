
document.getElementById('sumar').onclick = function() {
    const num1 = parseInt(document.getElementById("num1").value);
    const num2 = parseInt(document.getElementById("num2").value);
    let resultado;
     resultado = num1 + num2;
    
    document.getElementById('suma').textContent = "El resultado es: " + resultado;
};
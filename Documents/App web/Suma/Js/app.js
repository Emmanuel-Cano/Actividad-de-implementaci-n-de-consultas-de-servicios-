let sumar = document.getElementById("sumar");
function realizarSuma() {
let numero1 = parseFloat (document.getElementById("numero1").value);
let numero2 = parseFloat (document.getElementById("numero2").value);
let resultado = numero1 + numero2;
mostrarResultado(resultado, "suma");
}

function realizarResta() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = numero1 - numero2;
    mostrarResultado(resultado, "resta");
}

function realizarMultiplicacion() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = numero1 * numero2;
    mostrarResultado(resultado, "multiplicación");
}

function realizarDivision() {
    let numero1 = parseFloat(document.getElementById("numero1").value);
    let numero2 = parseFloat(document.getElementById("numero2").value);
    let resultado = numero1 / numero2;
    mostrarResultado(resultado, "división");
}

function mostrarResultado(resultado, operacion) {
    let mostrarResultado = document.getElementById("mostrarResultado");
    mostrarResultado.innerHTML = `<p>El resultado de la ${operacion} es: ${resultado}</p>`;
    console.log(`El resultado de la ${operacion} es: ${resultado}`);
}

document.getElementById("sumar").addEventListener("click", realizarSuma);
document.getElementById("restar").addEventListener("click", realizarResta);
document.getElementById("multiplicar").addEventListener("click", realizarMultiplicacion);
document.getElementById("dividir").addEventListener("click", realizarDivision);
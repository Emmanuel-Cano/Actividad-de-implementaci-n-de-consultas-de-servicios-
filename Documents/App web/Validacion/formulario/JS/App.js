function realizarRegistro() {
    let nombre = document.getElementById("nombre").value;
    let apellido = document.getElementById("apellido").value;
    let fecha = document.getElementById("fecha").value;
    let genero = document.querySelector('input[name="genero"]:checked');
    let terminos = document.getElementById("terminos").checked;

    if (!nombre || !apellido || !fecha || !genero || !terminos) {
        mostrarMensaje("Falta llenar campos o aceptar terminos");
    } else {
        mostrarMensaje("Registro exitoso, bienvenido  " + nombre);
    }
}

function mostrarMensaje(mensaje) {
    let mostrarMensaje = document.getElementById("mostrarMensaje");
    mostrarMensaje.innerHTML = `<p style="color:peru">${mensaje}</p>`;
}

document.getElementById("registrar").addEventListener("click", realizarRegistro);

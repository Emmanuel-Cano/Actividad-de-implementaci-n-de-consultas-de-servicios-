function realizarLogin() {
    let correo = document.getElementById("correo").value;
    let contrasena = document.getElementById("contrasena").value;
    if (!correo || !contrasena) {
        mostrarMensaje("Falta correo o contraseña pequeño jeringas");
    } else {
        mostrarMensaje("Bienvenido a la jungla");
    }
}

function mostrarMensaje(mensaje) {
    let mostrarMensaje = document.getElementById("mostrarMensaje");
    mostrarMensaje.innerHTML = `<p style="color:peru">${mensaje}</p>`;
}

document.getElementById("login").addEventListener("click", realizarLogin);
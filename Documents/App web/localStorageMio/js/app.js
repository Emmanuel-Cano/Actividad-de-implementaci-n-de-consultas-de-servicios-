const nombre = document.querySelector(".nombre");
const apellido = document.querySelector(".apellido");
const edad = document.querySelector(".edad");
const dia = document.querySelector(".dia");
const saludo = document.querySelector(".saludo");
const saludo2 = document.querySelector(".saludo2");
const saludo3 = document.querySelector(".saludo3");
const saludo4 = document.querySelector(".saludo4");

saludo.textContent = `Nombre: ${localStorage.getItem('nombre') || ''}`;
saludo2.textContent = `Apellido: ${localStorage.getItem('apellido') || ''}`;
saludo3.textContent = `Edad: ${localStorage.getItem('edad') || ''}`;
saludo4.textContent = `Fecha de nacimiento: ${localStorage.getItem('dia') || ''}`;

document.querySelector(".btnGuardarNombre").addEventListener("click", () => {
    if (nombre.value !== "") {
        localStorage.setItem('nombre', nombre.value);
        saludo.textContent = `Nombre: ${nombre.value}`;
    }
});

document.querySelector(".btnGuardarApellido").addEventListener("click", () => {
    if (apellido.value !== "") {
        localStorage.setItem('apellido', apellido.value);
        saludo2.textContent = `Apellido: ${apellido.value}`;
    }
});

document.querySelector(".btnGuardarEdad").addEventListener("click", () => {
    if (edad.value !== "") {
        localStorage.setItem('edad', edad.value);
        saludo3.textContent = `Edad: ${edad.value}`;
    }
});

document.querySelector(".btnGuardarDia").addEventListener("click", () => {
    if (dia.value !== "") {
        localStorage.setItem('dia', dia.value);
        saludo4.textContent = `Fecha de nacimiento: ${dia.value}`;
    }
});

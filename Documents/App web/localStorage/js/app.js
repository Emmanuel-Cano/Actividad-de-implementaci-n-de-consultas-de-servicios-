//Clase
const btnGuardar = document.querySelector(".btnGuardar");
const nombre = document.querySelector(".nombre");
const saludo = document.querySelector(".saludo");

//Mostrar la info de localStorage
const textoGuardo = localStorage.getItem('texto');
if(textoGuardo != ""){
    saludo.textContent = `Guardado: ${textoGuardo}`;
}

btnGuardar.addEventListener("click", ()=>{
    const texto = nombre.value;
    if(nombre != ""){
        localStorage.setItem('texto', texto);
        saludo.textContent = `Guardado: ${texto}`;
    }
});
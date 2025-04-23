let input = document.querySelector(".input")
let añadirBoton = document.querySelector(".añadir")
let contenedor = document.querySelector(".contenedor")
let reiniciarBoton = document.querySelector(".reiniciar")

let listaDeCompras = []

añadirBoton.addEventListener("click", añadirALaLista)

function añadirALaLista(){
    let valorAñadido = input.value
    listaDeCompras.push(valorAñadido); // Añade dentro del array los valores del imput
    contenedor.innerHTML = listaDeCompras.join("<br>"); //Muestra los valores de la lista separados por br
}
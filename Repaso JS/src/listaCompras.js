let input = document.querySelector(".input");
let lista = document.querySelector(".lista");
let reset = document.querySelector(".reset");
let añadir = document.querySelector(".añadir");

let total = []; // Array para almacenar la lista de compras

añadir.addEventListener("click", añadirALista);
reset.addEventListener("click", resetLista);

function añadirALista() {
    let valor = input.value.trim(); // Obtener el valor sin espacios extra

    if (valor !== "") {
        total.push(valor); // Agregar el producto al array
        actualizarLista(); // Mostrar la lista en HTML
        input.value = ""; // Limpiar input después de añadir
    } else {
        alert("Por favor, introduce un producto válido.");
    }
}

function actualizarLista() {
    lista.innerHTML = ""; // Limpiar la lista antes de actualizar

    total.forEach(function(item) { // Recorre el array y agrega cada elemento a la lista
        let li = document.createElement("li");
        li.textContent = item;
        lista.appendChild(li);
    });
}

function resetLista() {
    total = []; // Vaciar el array
    lista.innerHTML = ""; // Limpiar la lista en HTML
}

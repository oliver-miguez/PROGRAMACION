let input = document.querySelector(".input")
let boton = document.querySelector(".boton")
let respuesta = document.querySelector(".respuesta")
let reiniciar = document.querySelector(".Reiniciar")
let usos = 1
boton.addEventListener("click",generarNumero)
reiniciar.addEventListener("click",reiniciarJuego)
function generarNumero(){
    if(usos == 1){
        let numAleatorio = Math.floor(Math.random()*10)+1
        console.log(numAleatorio)

        if(input.value == numAleatorio){
            console.log("Ganaste")
            respuesta.textContent = "Ganaste"
            usos = 0
        }else{
            console.log("Perdiste")
            respuesta.textContent = "Perdiste"
            usos = 0
        }
    }else{
        respuesta.textContent="Pulse reiniciar para comenzar"
    }
}
function reiniciarJuego(){
    usos = 1
    respuesta.textContent = "Introduzca un numero del 1 al 10"
}
let cartas = [
    {id:1,palo: "oro",num:1,ruta:"pixelDeck/Oro/oro1.png"},
    {id:2,palo: "oro",num:2,ruta:"pixelDeck/Oro/oro2.png"},
    {id:3,palo: "oro",num:3,ruta:"pixelDeck/Oro/oro3.png"},
    {id:4,palo: "oro",num:4,ruta:"pixelDeck/Oro/oro4.png"},
    {id:5,palo: "oro",num:5,ruta:"pixelDeck/Oro/oro5.png"},
    {id:6,palo: "oro",num:6,ruta:"pixelDeck/Oro/oro6.png"},
    {id:7,palo: "oro",num:7,ruta:"pixelDeck/Oro/oro7.png"},
    {id:8,palo: "oro",num:8,ruta:"pixelDeck/Oro/oro8.png"},
    {id:9,palo: "oro",num:9,ruta:"pixelDeck/Oro/oro9.png"},
    {id:10,palo: "oro",num:10,ruta:"pixelDeck/Oro/oro10.png"},
    {id:11,palo:"espada",num:1,ruta:"pixelDeck/Espada/espada1.png"},
    {id:12,palo:"espada",num:2,ruta:"pixelDeck/Espada/espada2.png"},
    {id:13,palo:"espada",num:3,ruta:"pixelDeck/Espada/espada3.png"},
    {id:14,palo:"espada",num:4,ruta:"pixelDeck/Espada/espada4.png"},
    {id:15,palo:"espada",num:5,ruta:"pixelDeck/Espada/espada5.png"},
    {id:16,palo:"espada",num:6,ruta:"pixelDeck/Espada/espada6.png"},
    {id:17,palo:"espada",num:7,ruta:"pixelDeck/Espada/espada7.png"},
    {id:18,palo:"espada",num:8,ruta:"pixelDeck/Espada/espada8.png"},
    {id:19,palo:"espada",num:9,ruta:"pixelDeck/Espada/espada9.png"},
    {id:20,palo:"espada",num:10,ruta:"pixelDeck/Espada/espada10.png"},
    {id:21,palo:"basto",num:1,ruta:"pixelDeck/Basto/basto1.png"},
    {id:22,palo:"basto",num:2,ruta:"pixelDeck/Basto/basto2.png"},
    {id:23,palo:"basto",num:3,ruta:"pixelDeck/Basto/basto3.png"},
    {id:24,palo:"basto",num:4,ruta:"pixelDeck/Basto/basto4.png"},
    {id:25,palo:"basto",num:5,ruta:"pixelDeck/Basto/basto5.png"},
    {id:26,palo:"basto",num:6,ruta:"pixelDeck/Basto/basto6.png"},
    {id:27,palo:"basto",num:7,ruta:"pixelDeck/Basto/basto7.png"},
    {id:28,palo:"basto",num:8,ruta:"pixelDeck/Basto/basto8.png"},
    {id:29,palo:"basto",num:9,ruta:"pixelDeck/Basto/basto9.png"},
    {id:30,palo:"basto",num:10,ruta:"pixelDeck/Basto/basto10.png"},
    {id:31,palo:"copa",num:1,ruta:"pixelDeck/Copa/copa1.png"},
    {id:32,palo:"copa",num:2,ruta:"pixelDeck/Copa/copa2.png"},
    {id:33,palo:"copa",num:3,ruta:"pixelDeck/Copa/copa3.png"},
    {id:34,palo:"copa",num:4,ruta:"pixelDeck/Copa/copa4.png"},
    {id:35,palo:"copa",num:5,ruta:"pixelDeck/Copa/copa5.png"},
    {id:36,palo:"copa",num:6,ruta:"pixelDeck/Copa/copa6.png"},
    {id:37,palo:"copa",num:7,ruta:"pixelDeck/Copa/copa7.png"},
    {id:38,palo:"copa",num:8,ruta:"pixelDeck/Copa/copa8.png"},
    {id:39,palo:"copa",num:9,ruta:"pixelDeck/Copa/copa9.png"},
    {id:40,palo:"copa",num:10,ruta:"pixelDeck/Copa/copa10.png"}
];

let generarMano = document.querySelector(".generarMano");
let contenedores = document.querySelectorAll("img");

generarMano.addEventListener("click", () => {
    let cartasGeneradas = []; // Array para cartas únicas
    for (let i = 0; i < contenedores.length; i++) {
        let carta;
        do {
            carta = cartas[Math.floor(Math.random() * cartas.length)];
        } while (cartasGeneradas.includes(carta)); // Si ya está generada, repite
        cartasGeneradas.push(carta); // Añade la carta única
        contenedores[i].src = carta.ruta; // Asigna la ruta
    }
});

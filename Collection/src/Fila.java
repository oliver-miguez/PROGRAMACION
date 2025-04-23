/**
 * Para quitar elementos del inicio del array y para añadir elementos desde el final del array
 */
public interface Fila <T> {
    void encolar(T novo); //añadir elementos por el final
    void desencolar(); //quitar elementos desde el principio
}

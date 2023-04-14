package guia8.extras.ejercicio2;

import guia8.extras.ejercicio2.entidades.NIF;
import guia8.extras.ejercicio2.servicios.NIFService;

public class Core {
    public static void main(String[] args) {
        NIF nif = NIFService.crearNif();

        NIFService.mostrarNif(nif);
    }
}
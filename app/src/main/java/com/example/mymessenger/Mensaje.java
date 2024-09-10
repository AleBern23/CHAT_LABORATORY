package com.example.mymessenger;

import java.util.ArrayList;

public class Mensaje {
    private ArrayList mensajesLista = new ArrayList();

    public void agregarMensaje(String mensaje) {
        mensajesLista.add(mensaje);
    }

    public String getMensajeFinal() {
        int longitud = mensajesLista.size();
        return mensajesLista.get(longitud-1).toString();
    }

    public StringBuilder getMensajes() {
        StringBuilder todosLosMensajes = new StringBuilder();
        for (Object mensaje : mensajesLista) {
            todosLosMensajes.append(mensaje).append(" ");
        }
        return todosLosMensajes;
    }

    public ArrayList getMensajesLista() {
        return mensajesLista;
    }
}

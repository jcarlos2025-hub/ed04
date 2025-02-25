package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jcarlos
 * @version 1.0  02/25/25
 */
public class Persona {
    private String name;
    private List<String> phones;

    /**
     *
     * @param name Nombre del contacto
     * @param phone Telefono del contacto
     * Creacion de un nuevo contacto
     */
    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     *
     * @return El nombre del contacto
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return La lista de telefonos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
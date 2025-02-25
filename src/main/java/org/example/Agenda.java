package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jcarlos
 * @version 1.0  02/25/25
 */
public class Agenda {
    private List<Contacto> contacts; // Lista de Contacto

    /**
     * Creacion de objeto Agenda, un array
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     *
     * @param name Nombre del nuevo contacto
     * @param phone Telefono del nuevo contacto
     * Si el contacto no existe, se crea el nuevo contacto en la lista de contactos
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Contacto newContact = new Contacto(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     *
     * @param name Nombre del contacto a eliminar
     * Si el contqacto existe, es eliminado
     */
    public void removeContact(String name) {
        Iterator<Contacto> it = contacts.iterator();

        while (it.hasNext()) {
            Contacto c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     *
     * @param name Nombre del contacto
     * @param oldPhone Numero de telefono antiguo
     * @param newPhone Numero de telefono nuevo
     * Modificacion de numeros de telefono desactualizados
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Contacto c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     *
     * @return La lista de contactos
     */
    public List<Contacto> getContacts() {
        return this.contacts;
    }
}
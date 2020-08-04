/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.mor.chinelo.tip1;

import java.util.HashMap;

/**
 *
 * @author Marco Antonio Barrios Molina | Chinelo Fundator | www.chinelo.io
 */
public class Store {

    private String id;
    private String name;
    private String rfc;
    private String email;
    private HashMap<String, String> permissions;

    public Store() {
        this.permissions = new HashMap<>();
        this.permissions.put("idOperacionCuatro", "Descripción Operacion Cuatro");
        this.permissions.put("idOperacionCinco", "Descripción Operacion Cinco");
        this.permissions.put("idOperacionSeis", "Descripción Operacion Seis");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, String> getPermissions() {
        return permissions;
    }

    public void setPermissions(HashMap<String, String> permissions) {
        this.permissions = permissions;
    }

}

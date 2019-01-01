package com.wissensalt.simplepasswordencoder;

import java.io.Serializable;

/**
 * Created on 11/25/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class RequestPasswordDTO implements Serializable {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

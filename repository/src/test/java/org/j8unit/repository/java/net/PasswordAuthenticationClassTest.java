package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PasswordAuthenticationClassTest
implements org.j8unit.repository.java.net.PasswordAuthenticationClassTests<java.net.PasswordAuthentication> {

    @Override
    public Class<java.net.PasswordAuthentication> createNewSUT() {
        return java.net.PasswordAuthentication.class;
    }

}

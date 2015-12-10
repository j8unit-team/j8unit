package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarURLConnectionClassTest
implements org.j8unit.repository.java.net.JarURLConnectionClassTests<java.net.JarURLConnection> {

    @Override
    public Class<java.net.JarURLConnection> createNewSUT() {
        return java.net.JarURLConnection.class;
    }

}

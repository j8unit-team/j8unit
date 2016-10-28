package org.j8unit.repository.java.net;

import java.net.JarURLConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarURLConnectionClassTest
implements org.j8unit.repository.java.net.JarURLConnectionClassTests<JarURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.JarURLConnection]

    @Override
    public Class<JarURLConnection> createNewSUT() {
        return JarURLConnection.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.JarURLConnection]

}

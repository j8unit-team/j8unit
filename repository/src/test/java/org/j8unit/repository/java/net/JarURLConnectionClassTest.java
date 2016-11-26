package org.j8unit.repository.java.net;

import java.net.JarURLConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JarURLConnection} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.JarURLConnectionClassTests}).
 */
@RunWith(J8Unit4.class)
public class JarURLConnectionClassTest
implements JarURLConnectionClassTests<JarURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.JarURLConnection]

    @Override
    public Class<JarURLConnection> createNewSUT() {
        return JarURLConnection.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.JarURLConnection]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.JarURLConnection]

}

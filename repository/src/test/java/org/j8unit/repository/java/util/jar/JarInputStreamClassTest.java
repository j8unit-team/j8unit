package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarInputStreamClassTest
implements org.j8unit.repository.java.util.jar.JarInputStreamClassTests<java.util.jar.JarInputStream> {

    @Override
    public Class<java.util.jar.JarInputStream> createNewSUT() {
        return java.util.jar.JarInputStream.class;
    }

}

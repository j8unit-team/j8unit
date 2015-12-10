package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarExceptionClassTest
implements org.j8unit.repository.java.util.jar.JarExceptionClassTests<java.util.jar.JarException> {

    @Override
    public Class<java.util.jar.JarException> createNewSUT() {
        return java.util.jar.JarException.class;
    }

}

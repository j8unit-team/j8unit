package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarExceptionTest
implements org.j8unit.repository.java.util.jar.JarExceptionTests<java.util.jar.JarException> {

    @Override
    public java.util.jar.JarException createNewSUT() {
        return new java.util.jar.JarException();
    }

}

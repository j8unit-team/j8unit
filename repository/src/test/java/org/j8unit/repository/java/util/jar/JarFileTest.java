package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarFileTest
implements org.j8unit.repository.java.util.jar.JarFileTests<java.util.jar.JarFile> {

    @Override
    public java.util.jar.JarFile createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.jar.JarFile] available.");
    }

}

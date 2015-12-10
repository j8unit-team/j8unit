package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarOutputStreamTest
implements org.j8unit.repository.java.util.jar.JarOutputStreamTests<java.util.jar.JarOutputStream> {

    @Override
    public java.util.jar.JarOutputStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.jar.JarOutputStream] available.");
    }

}

package org.j8unit.repository.java.util.jar;

import java.util.jar.JarOutputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarOutputStreamTest
implements org.j8unit.repository.java.util.jar.JarOutputStreamTests<JarOutputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarOutputStream]

    @Override
    public JarOutputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.jar.JarOutputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.jar.JarOutputStream]

}

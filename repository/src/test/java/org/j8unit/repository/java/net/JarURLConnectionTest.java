package org.j8unit.repository.java.net;

import java.net.JarURLConnection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarURLConnectionTest
implements org.j8unit.repository.java.net.JarURLConnectionTests<JarURLConnection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.JarURLConnection]

    @Override
    public JarURLConnection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.JarURLConnection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.JarURLConnection]

}

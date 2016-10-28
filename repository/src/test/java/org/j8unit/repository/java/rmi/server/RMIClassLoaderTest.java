package org.j8unit.repository.java.rmi.server;

import java.rmi.server.RMIClassLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMIClassLoaderTest
implements org.j8unit.repository.java.rmi.server.RMIClassLoaderTests<RMIClassLoader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClassLoader]

    @Override
    public RMIClassLoader createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.server.RMIClassLoader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.server.RMIClassLoader]

}

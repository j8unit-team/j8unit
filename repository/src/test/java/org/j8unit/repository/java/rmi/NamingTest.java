package org.j8unit.repository.java.rmi;

import java.rmi.Naming;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingTest
implements org.j8unit.repository.java.rmi.NamingTests<Naming> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.Naming]

    @Override
    public Naming createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.rmi.Naming], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.rmi.Naming]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.rmi.Naming]

}

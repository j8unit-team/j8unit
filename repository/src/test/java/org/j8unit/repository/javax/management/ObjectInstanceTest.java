package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectInstanceTest
implements org.j8unit.repository.javax.management.ObjectInstanceTests<javax.management.ObjectInstance> {

    @Override
    public javax.management.ObjectInstance createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.ObjectInstance] available.");
    }

}

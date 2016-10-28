package org.j8unit.repository.java.util;

import java.util.Observer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObserverTest
implements org.j8unit.repository.java.util.ObserverTests<Observer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Observer]

    @Override
    public Observer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.Observer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Observer]

}

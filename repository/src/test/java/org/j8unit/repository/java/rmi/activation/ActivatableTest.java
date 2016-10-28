package org.j8unit.repository.java.rmi.activation;

import java.rmi.activation.Activatable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ActivatableTest
implements org.j8unit.repository.java.rmi.activation.ActivatableTests<Activatable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.Activatable]

    @Override
    public Activatable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.activation.Activatable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.activation.Activatable]

}

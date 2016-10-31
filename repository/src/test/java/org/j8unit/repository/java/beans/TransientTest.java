package org.j8unit.repository.java.beans;

import java.beans.Transient;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransientTest
implements org.j8unit.repository.java.beans.TransientTests<Transient> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Transient]

    @Override
    public Transient createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.Transient], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.Transient]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.Transient]

}

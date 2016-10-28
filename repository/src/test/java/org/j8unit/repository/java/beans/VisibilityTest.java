package org.j8unit.repository.java.beans;

import java.beans.Visibility;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VisibilityTest
implements org.j8unit.repository.java.beans.VisibilityTests<Visibility> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Visibility]

    @Override
    public Visibility createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.Visibility], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Visibility]

}

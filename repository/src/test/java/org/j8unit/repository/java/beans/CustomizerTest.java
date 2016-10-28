package org.j8unit.repository.java.beans;

import java.beans.Customizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CustomizerTest
implements org.j8unit.repository.java.beans.CustomizerTests<Customizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Customizer]

    @Override
    public Customizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.Customizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.Customizer]

}

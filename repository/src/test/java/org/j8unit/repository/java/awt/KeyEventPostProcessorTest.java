package org.j8unit.repository.java.awt;

import java.awt.KeyEventPostProcessor;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyEventPostProcessorTest
implements org.j8unit.repository.java.awt.KeyEventPostProcessorTests<KeyEventPostProcessor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.KeyEventPostProcessor]

    @Override
    public KeyEventPostProcessor createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.KeyEventPostProcessor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.KeyEventPostProcessor]

}

package org.j8unit.repository.javax.swing;

import javax.swing.BorderFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BorderFactoryTest
implements org.j8unit.repository.javax.swing.BorderFactoryTests<BorderFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.BorderFactory]

    @Override
    public BorderFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.BorderFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.BorderFactory]

}

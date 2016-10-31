package org.j8unit.repository.javax.swing;

import javax.swing.AbstractButton;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractButtonTest
implements org.j8unit.repository.javax.swing.AbstractButtonTests<AbstractButton> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.AbstractButton]

    @Override
    public AbstractButton createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.AbstractButton], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.AbstractButton]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.AbstractButton]

}

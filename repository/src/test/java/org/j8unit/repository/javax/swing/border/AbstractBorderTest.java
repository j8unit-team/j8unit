package org.j8unit.repository.javax.swing.border;

import javax.swing.border.AbstractBorder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AbstractBorderTest
implements org.j8unit.repository.javax.swing.border.AbstractBorderTests<AbstractBorder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.AbstractBorder]

    @Override
    public AbstractBorder createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.border.AbstractBorder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.border.AbstractBorder]

}

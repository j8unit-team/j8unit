package org.j8unit.repository.javax.swing;

import javax.swing.JComponent;
import javax.swing.JComponent.AccessibleJComponent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JComponentTest
implements org.j8unit.repository.javax.swing.JComponentTests<JComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComponent]

    @Override
    public JComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.JComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComponent]

    @RunWith(J8Unit4.class)
    public static class AccessibleJComponentTest
    implements org.j8unit.repository.javax.swing.JComponentTests.AccessibleJComponentTests<AccessibleJComponent> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComponent$AccessibleJComponent]

        @Override
        public AccessibleJComponent createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.JComponent.AccessibleJComponent], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.JComponent$AccessibleJComponent]

    }

}

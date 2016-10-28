package org.j8unit.repository.javax.swing.text;

import javax.swing.text.JTextComponent;
import javax.swing.text.JTextComponent.AccessibleJTextComponent;
import javax.swing.text.JTextComponent.DropLocation;
import javax.swing.text.JTextComponent.KeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextComponentTest
implements org.j8unit.repository.javax.swing.text.JTextComponentTests<JTextComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent]

    @Override
    public JTextComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.JTextComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent]

    @RunWith(J8Unit4.class)
    public static class AccessibleJTextComponentTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests<AccessibleJTextComponent> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

        @Override
        public AccessibleJTextComponent createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.AccessibleJTextComponent], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

    }

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$DropLocation]

    }

    @RunWith(J8Unit4.class)
    public static class KeyBindingTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests<KeyBinding> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$KeyBinding]

        @Override
        public KeyBinding createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.KeyBinding], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$KeyBinding]

    }

}

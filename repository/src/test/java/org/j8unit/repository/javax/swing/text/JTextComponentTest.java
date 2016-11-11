package org.j8unit.repository.javax.swing.text;

import javax.swing.text.JTextComponent;
import javax.swing.text.JTextComponent.AccessibleJTextComponent;
import javax.swing.text.JTextComponent.DropLocation;
import javax.swing.text.JTextComponent.KeyBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JTextComponent} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.JTextComponentTests}).
 */

@RunWith(J8Unit4.class)
public class JTextComponentTest
implements JTextComponentTests<JTextComponent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent]

    @Override
    public JTextComponent createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.JTextComponent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.JTextComponent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.JTextComponent]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DropLocation} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentTests.DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.JTextComponent$DropLocation]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.JTextComponent$DropLocation]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link KeyBinding} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.KeyBindingTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KeyBindingTest
    implements KeyBindingTests<KeyBinding> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$KeyBinding]

        @Override
        public KeyBinding createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.KeyBinding], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.JTextComponent$KeyBinding]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.JTextComponent$KeyBinding]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleJTextComponent} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.JTextComponentTests.AccessibleJTextComponentTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AccessibleJTextComponentTest
    implements AccessibleJTextComponentTests<AccessibleJTextComponent> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

        @Override
        public AccessibleJTextComponent createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.JTextComponent.AccessibleJTextComponent], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.JTextComponent$AccessibleJTextComponent]

    }

}

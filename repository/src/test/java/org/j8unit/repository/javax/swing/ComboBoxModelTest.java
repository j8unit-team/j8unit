package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComboBoxModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.ComboBoxModelTests}).
 */

@RunWith(J8Unit4.class)
public class ComboBoxModelTest<E>
implements ComboBoxModelTests<ComboBoxModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ComboBoxModel]

    @Override
    public ComboBoxModel<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ComboBoxModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ComboBoxModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ComboBoxModel]

}

package org.j8unit.repository.javax.swing;

import javax.swing.ComboBoxModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComboBoxModelTest<E>
implements org.j8unit.repository.javax.swing.ComboBoxModelTests<ComboBoxModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ComboBoxModel]

    @Override
    public ComboBoxModel<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ComboBoxModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ComboBoxModel]

}

package org.j8unit.repository.javax.swing;

import javax.swing.MutableComboBoxModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MutableComboBoxModelTest<E>
implements org.j8unit.repository.javax.swing.MutableComboBoxModelTests<MutableComboBoxModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.MutableComboBoxModel]

    @Override
    public MutableComboBoxModel<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.MutableComboBoxModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.MutableComboBoxModel]

}

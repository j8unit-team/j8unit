package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultComboBoxModelTest<E>
implements org.j8unit.repository.javax.swing.DefaultComboBoxModelTests<javax.swing.DefaultComboBoxModel<E>, E> {

    @Override
    public javax.swing.DefaultComboBoxModel<E> createNewSUT() {
        return new javax.swing.DefaultComboBoxModel();
    }

}

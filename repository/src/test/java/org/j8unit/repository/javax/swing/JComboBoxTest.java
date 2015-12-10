package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JComboBoxTest<E>
implements org.j8unit.repository.javax.swing.JComboBoxTests<javax.swing.JComboBox<E>, E> {

    @Override
    public javax.swing.JComboBox<E> createNewSUT() {
        return new javax.swing.JComboBox();
    }

}

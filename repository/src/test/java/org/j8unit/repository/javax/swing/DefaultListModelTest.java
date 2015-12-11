package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultListModelTest<E>
implements org.j8unit.repository.javax.swing.DefaultListModelTests<javax.swing.DefaultListModel<E>, E> {

    @Override
    public javax.swing.DefaultListModel<E> createNewSUT() {
        return new javax.swing.DefaultListModel<>();
    }

}

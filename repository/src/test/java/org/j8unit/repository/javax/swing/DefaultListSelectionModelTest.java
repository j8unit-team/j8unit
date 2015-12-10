package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultListSelectionModelTest
implements org.j8unit.repository.javax.swing.DefaultListSelectionModelTests<javax.swing.DefaultListSelectionModel> {

    @Override
    public javax.swing.DefaultListSelectionModel createNewSUT() {
        return new javax.swing.DefaultListSelectionModel();
    }

}

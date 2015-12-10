package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultSingleSelectionModelTest
implements org.j8unit.repository.javax.swing.DefaultSingleSelectionModelTests<javax.swing.DefaultSingleSelectionModel> {

    @Override
    public javax.swing.DefaultSingleSelectionModel createNewSUT() {
        return new javax.swing.DefaultSingleSelectionModel();
    }

}

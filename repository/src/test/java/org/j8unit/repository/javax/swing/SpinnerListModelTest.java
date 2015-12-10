package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpinnerListModelTest
implements org.j8unit.repository.javax.swing.SpinnerListModelTests<javax.swing.SpinnerListModel> {

    @Override
    public javax.swing.SpinnerListModel createNewSUT() {
        return new javax.swing.SpinnerListModel();
    }

}

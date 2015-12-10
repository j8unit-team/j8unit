package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpinnerNumberModelTest
implements org.j8unit.repository.javax.swing.SpinnerNumberModelTests<javax.swing.SpinnerNumberModel> {

    @Override
    public javax.swing.SpinnerNumberModel createNewSUT() {
        return new javax.swing.SpinnerNumberModel();
    }

}

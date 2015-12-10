package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultButtonModelTest
implements org.j8unit.repository.javax.swing.DefaultButtonModelTests<javax.swing.DefaultButtonModel> {

    @Override
    public javax.swing.DefaultButtonModel createNewSUT() {
        return new javax.swing.DefaultButtonModel();
    }

}

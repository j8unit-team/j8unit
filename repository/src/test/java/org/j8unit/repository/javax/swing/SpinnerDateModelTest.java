package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpinnerDateModelTest
implements org.j8unit.repository.javax.swing.SpinnerDateModelTests<javax.swing.SpinnerDateModel> {

    @Override
    public javax.swing.SpinnerDateModel createNewSUT() {
        return new javax.swing.SpinnerDateModel();
    }

}

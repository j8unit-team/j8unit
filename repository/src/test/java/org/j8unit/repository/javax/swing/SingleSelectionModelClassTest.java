package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SingleSelectionModelClassTest
implements org.j8unit.repository.javax.swing.SingleSelectionModelClassTests<javax.swing.SingleSelectionModel> {

    @Override
    public Class<javax.swing.SingleSelectionModel> createNewSUT() {
        return javax.swing.SingleSelectionModel.class;
    }

}

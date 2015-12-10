package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ListModelClassTest
implements org.j8unit.repository.javax.swing.ListModelClassTests<javax.swing.ListModel> {

    @Override
    public Class<javax.swing.ListModel> createNewSUT() {
        return javax.swing.ListModel.class;
    }

}

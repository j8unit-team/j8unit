package org.j8unit.repository.javax.swing;

import javax.swing.ListModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ListModelClassTest
implements org.j8unit.repository.javax.swing.ListModelClassTests<ListModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.ListModel]

    @Override
    public Class<ListModel> createNewSUT() {
        return ListModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.ListModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.ListModel]

}

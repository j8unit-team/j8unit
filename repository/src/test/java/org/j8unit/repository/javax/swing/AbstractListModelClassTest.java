package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractListModelClassTest
implements org.j8unit.repository.javax.swing.AbstractListModelClassTests<javax.swing.AbstractListModel> {

    @Override
    public Class<javax.swing.AbstractListModel> createNewSUT() {
        return javax.swing.AbstractListModel.class;
    }

}

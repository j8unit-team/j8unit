package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ComboBoxModelClassTest
implements org.j8unit.repository.javax.swing.ComboBoxModelClassTests<javax.swing.ComboBoxModel> {

    @Override
    public Class<javax.swing.ComboBoxModel> createNewSUT() {
        return javax.swing.ComboBoxModel.class;
    }

}

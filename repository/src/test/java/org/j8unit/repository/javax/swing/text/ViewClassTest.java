package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ViewClassTest
implements org.j8unit.repository.javax.swing.text.ViewClassTests<javax.swing.text.View> {

    @Override
    public Class<javax.swing.text.View> createNewSUT() {
        return javax.swing.text.View.class;
    }

}

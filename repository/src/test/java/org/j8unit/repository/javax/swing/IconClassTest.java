package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IconClassTest
implements org.j8unit.repository.javax.swing.IconClassTests<javax.swing.Icon> {

    @Override
    public Class<javax.swing.Icon> createNewSUT() {
        return javax.swing.Icon.class;
    }

}

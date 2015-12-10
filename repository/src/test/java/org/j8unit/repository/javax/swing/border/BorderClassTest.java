package org.j8unit.repository.javax.swing.border;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BorderClassTest
implements org.j8unit.repository.javax.swing.border.BorderClassTests<javax.swing.border.Border> {

    @Override
    public Class<javax.swing.border.Border> createNewSUT() {
        return javax.swing.border.Border.class;
    }

}

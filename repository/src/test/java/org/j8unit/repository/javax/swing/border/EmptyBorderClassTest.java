package org.j8unit.repository.javax.swing.border;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EmptyBorderClassTest
implements org.j8unit.repository.javax.swing.border.EmptyBorderClassTests<javax.swing.border.EmptyBorder> {

    @Override
    public Class<javax.swing.border.EmptyBorder> createNewSUT() {
        return javax.swing.border.EmptyBorder.class;
    }

}

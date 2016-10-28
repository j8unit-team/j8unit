package org.j8unit.repository.javax.swing;

import javax.swing.Icon;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IconClassTest
implements org.j8unit.repository.javax.swing.IconClassTests<Icon> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Icon]

    @Override
    public Class<Icon> createNewSUT() {
        return Icon.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Icon]

}

package org.j8unit.repository.javax.swing.border;

import javax.swing.border.Border;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BorderClassTest
implements org.j8unit.repository.javax.swing.border.BorderClassTests<Border> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.border.Border]

    @Override
    public Class<Border> createNewSUT() {
        return Border.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.border.Border]

}

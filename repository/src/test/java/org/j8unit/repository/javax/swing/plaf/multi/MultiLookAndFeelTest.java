package org.j8unit.repository.javax.swing.plaf.multi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiLookAndFeelTest
implements org.j8unit.repository.javax.swing.plaf.multi.MultiLookAndFeelTests<javax.swing.plaf.multi.MultiLookAndFeel> {

    @Override
    public javax.swing.plaf.multi.MultiLookAndFeel createNewSUT() {
        return new javax.swing.plaf.multi.MultiLookAndFeel();
    }

}

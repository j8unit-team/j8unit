package org.j8unit.repository.javax.swing.plaf.multi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultiLookAndFeelClassTest
implements org.j8unit.repository.javax.swing.plaf.multi.MultiLookAndFeelClassTests<javax.swing.plaf.multi.MultiLookAndFeel> {

    @Override
    public Class<javax.swing.plaf.multi.MultiLookAndFeel> createNewSUT() {
        return javax.swing.plaf.multi.MultiLookAndFeel.class;
    }

}

package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JSeparatorClassTest
implements org.j8unit.repository.javax.swing.JSeparatorClassTests<javax.swing.JSeparator> {

    @Override
    public Class<javax.swing.JSeparator> createNewSUT() {
        return javax.swing.JSeparator.class;
    }

}

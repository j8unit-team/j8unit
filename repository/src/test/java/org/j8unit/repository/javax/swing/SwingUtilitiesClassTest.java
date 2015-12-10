package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SwingUtilitiesClassTest
implements org.j8unit.repository.javax.swing.SwingUtilitiesClassTests<javax.swing.SwingUtilities> {

    @Override
    public Class<javax.swing.SwingUtilities> createNewSUT() {
        return javax.swing.SwingUtilities.class;
    }

}

package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JProgressBarClassTest
implements org.j8unit.repository.javax.swing.JProgressBarClassTests<javax.swing.JProgressBar> {

    @Override
    public Class<javax.swing.JProgressBar> createNewSUT() {
        return javax.swing.JProgressBar.class;
    }

}

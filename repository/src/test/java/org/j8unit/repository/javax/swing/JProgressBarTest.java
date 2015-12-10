package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JProgressBarTest
implements org.j8unit.repository.javax.swing.JProgressBarTests<javax.swing.JProgressBar> {

    @Override
    public javax.swing.JProgressBar createNewSUT() {
        return new javax.swing.JProgressBar();
    }

}

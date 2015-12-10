package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JViewportTest
implements org.j8unit.repository.javax.swing.JViewportTests<javax.swing.JViewport> {

    @Override
    public javax.swing.JViewport createNewSUT() {
        return new javax.swing.JViewport();
    }

}

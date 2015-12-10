package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RepaintManagerTest
implements org.j8unit.repository.javax.swing.RepaintManagerTests<javax.swing.RepaintManager> {

    @Override
    public javax.swing.RepaintManager createNewSUT() {
        return new javax.swing.RepaintManager();
    }

}

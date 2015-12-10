package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GrayFilterClassTest
implements org.j8unit.repository.javax.swing.GrayFilterClassTests<javax.swing.GrayFilter> {

    @Override
    public Class<javax.swing.GrayFilter> createNewSUT() {
        return javax.swing.GrayFilter.class;
    }

}

package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OverrideClassTest
implements org.j8unit.repository.java.lang.OverrideClassTests<Override> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Override]

    @Override
    public Class<Override> createNewSUT() {
        return Override.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Override]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Override]

}

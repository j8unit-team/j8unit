package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VoidClassTest
implements org.j8unit.repository.java.lang.VoidClassTests<Void> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Void]

    @Override
    public Class<Void> createNewSUT() {
        return Void.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Void]

}

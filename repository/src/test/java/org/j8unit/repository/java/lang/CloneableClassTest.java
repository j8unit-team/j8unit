package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CloneableClassTest
implements org.j8unit.repository.java.lang.CloneableClassTests<Cloneable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Cloneable]

    @Override
    public Class<Cloneable> createNewSUT() {
        return Cloneable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Cloneable]

}

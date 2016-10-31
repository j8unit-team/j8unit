package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ComparableClassTest
implements org.j8unit.repository.java.lang.ComparableClassTests<Comparable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Comparable]

    @Override
    public Class<Comparable> createNewSUT() {
        return Comparable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Comparable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Comparable]

}

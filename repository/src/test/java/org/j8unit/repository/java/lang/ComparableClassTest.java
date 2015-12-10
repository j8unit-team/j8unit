package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ComparableClassTest
implements org.j8unit.repository.java.lang.ComparableClassTests<java.lang.Comparable> {

    @Override
    public Class<java.lang.Comparable> createNewSUT() {
        return java.lang.Comparable.class;
    }

}

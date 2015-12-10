package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TreeSetClassTest
implements org.j8unit.repository.java.util.TreeSetClassTests<java.util.TreeSet> {

    @Override
    public Class<java.util.TreeSet> createNewSUT() {
        return java.util.TreeSet.class;
    }

}

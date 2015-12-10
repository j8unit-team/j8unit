package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class NavigableSetClassTest
implements org.j8unit.repository.java.util.NavigableSetClassTests<java.util.NavigableSet> {

    @Override
    public Class<java.util.NavigableSet> createNewSUT() {
        return java.util.NavigableSet.class;
    }

}

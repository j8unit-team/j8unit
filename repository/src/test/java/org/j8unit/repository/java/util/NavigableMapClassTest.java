package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class NavigableMapClassTest
implements org.j8unit.repository.java.util.NavigableMapClassTests<java.util.NavigableMap> {

    @Override
    public Class<java.util.NavigableMap> createNewSUT() {
        return java.util.NavigableMap.class;
    }

}

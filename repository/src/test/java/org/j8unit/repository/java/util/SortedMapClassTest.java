package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SortedMapClassTest
implements org.j8unit.repository.java.util.SortedMapClassTests<java.util.SortedMap> {

    @Override
    public Class<java.util.SortedMap> createNewSUT() {
        return java.util.SortedMap.class;
    }

}

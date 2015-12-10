package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class TreeMapClassTest
implements org.j8unit.repository.java.util.TreeMapClassTests<java.util.TreeMap> {

    @Override
    public Class<java.util.TreeMap> createNewSUT() {
        return java.util.TreeMap.class;
    }

}

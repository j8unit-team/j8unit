package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LinkedHashSetClassTest
implements org.j8unit.repository.java.util.LinkedHashSetClassTests<java.util.LinkedHashSet> {

    @Override
    public Class<java.util.LinkedHashSet> createNewSUT() {
        return java.util.LinkedHashSet.class;
    }

}

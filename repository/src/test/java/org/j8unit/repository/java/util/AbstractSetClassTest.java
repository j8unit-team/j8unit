package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractSetClassTest
implements org.j8unit.repository.java.util.AbstractSetClassTests<java.util.AbstractSet> {

    @Override
    public Class<java.util.AbstractSet> createNewSUT() {
        return java.util.AbstractSet.class;
    }

}

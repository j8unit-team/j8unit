package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractListClassTest
implements org.j8unit.repository.java.util.AbstractListClassTests<java.util.AbstractList> {

    @Override
    public Class<java.util.AbstractList> createNewSUT() {
        return java.util.AbstractList.class;
    }

}

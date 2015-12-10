package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class AbstractSequentialListClassTest
implements org.j8unit.repository.java.util.AbstractSequentialListClassTests<java.util.AbstractSequentialList> {

    @Override
    public Class<java.util.AbstractSequentialList> createNewSUT() {
        return java.util.AbstractSequentialList.class;
    }

}

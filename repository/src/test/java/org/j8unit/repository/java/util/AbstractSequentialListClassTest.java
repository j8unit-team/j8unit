package org.j8unit.repository.java.util;

import java.util.AbstractSequentialList;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractSequentialListClassTest
implements org.j8unit.repository.java.util.AbstractSequentialListClassTests<AbstractSequentialList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractSequentialList]

    @Override
    public Class<AbstractSequentialList> createNewSUT() {
        return AbstractSequentialList.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractSequentialList]

}

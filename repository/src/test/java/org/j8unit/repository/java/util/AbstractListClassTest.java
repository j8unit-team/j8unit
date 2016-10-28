package org.j8unit.repository.java.util;

import java.util.AbstractList;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractListClassTest
implements org.j8unit.repository.java.util.AbstractListClassTests<AbstractList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractList]

    @Override
    public Class<AbstractList> createNewSUT() {
        return AbstractList.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractList]

}

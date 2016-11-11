package org.j8unit.repository.java.util;

import java.util.AbstractList;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.AbstractListClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractListClassTest
implements AbstractListClassTests<AbstractList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.AbstractList]

    @Override
    public Class<AbstractList> createNewSUT() {
        return AbstractList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.AbstractList]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.AbstractList]

}

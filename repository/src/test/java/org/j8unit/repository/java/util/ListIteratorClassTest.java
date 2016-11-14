package org.j8unit.repository.java.util;

import java.util.ListIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ListIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.ListIteratorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ListIteratorClassTest
implements ListIteratorClassTests<ListIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.ListIterator]

    @Override
    public Class<ListIterator> createNewSUT() {
        return ListIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.ListIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.ListIterator]

}

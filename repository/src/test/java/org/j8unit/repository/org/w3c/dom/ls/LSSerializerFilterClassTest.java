package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSSerializerFilter;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSSerializerFilter} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.ls.LSSerializerFilterClassTests}).
 */
@RunWith(J8Unit4.class)
public class LSSerializerFilterClassTest
implements LSSerializerFilterClassTests<LSSerializerFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSSerializerFilter]

    @Override
    public Class<LSSerializerFilter> createNewSUT() {
        return LSSerializerFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSSerializerFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSSerializerFilter]

}

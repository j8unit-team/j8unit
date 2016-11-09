package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.AttributeList;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributeList} (by simply reusing the
 * J8Unit test interface {@link AttributeListClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributeListClassTest
implements AttributeListClassTests<AttributeList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.AttributeList]

    @Override
    public Class<AttributeList> createNewSUT() {
        return AttributeList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.AttributeList]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.AttributeList]

}

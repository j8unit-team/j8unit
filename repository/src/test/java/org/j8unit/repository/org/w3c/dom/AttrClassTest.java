package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Attr;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Attr} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.org.w3c.dom.AttrClassTests}).
 */
@RunWith(J8Unit4.class)
public class AttrClassTest
implements AttrClassTests<Attr> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Attr]

    @Override
    public Class<Attr> createNewSUT() {
        return Attr.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Attr]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Attr]

}

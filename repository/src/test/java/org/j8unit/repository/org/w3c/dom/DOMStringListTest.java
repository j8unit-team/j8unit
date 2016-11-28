package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMStringList;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMStringList} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.DOMStringListTests}).
 */
@RunWith(J8Unit4.class)
public class DOMStringListTest
implements DOMStringListTests<DOMStringList> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.DOMStringList]

    @Override
    public DOMStringList createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.DOMStringList], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.DOMStringList]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.DOMStringList]

}

package org.j8unit.repository.javax.xml.transform.dom;

import javax.xml.transform.dom.DOMLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMLocator} (by simply reusing the
 * J8Unit test interface {@link DOMLocatorTests}).
 */

@RunWith(J8Unit4.class)
public class DOMLocatorTest
implements DOMLocatorTests<DOMLocator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.dom.DOMLocator]

    @Override
    public DOMLocator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.dom.DOMLocator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.dom.DOMLocator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.dom.DOMLocator]

}

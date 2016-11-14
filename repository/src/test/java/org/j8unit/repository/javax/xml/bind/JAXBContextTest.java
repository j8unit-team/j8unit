package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JAXBContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.JAXBContextTests}).
 */

@RunWith(J8Unit4.class)
public class JAXBContextTest
implements JAXBContextTests<JAXBContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBContext]

    @Override
    public JAXBContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.JAXBContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBContext]

}

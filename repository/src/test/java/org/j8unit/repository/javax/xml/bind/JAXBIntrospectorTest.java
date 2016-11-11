package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBIntrospector;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JAXBIntrospector} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.JAXBIntrospectorTests}).
 */

@RunWith(J8Unit4.class)
public class JAXBIntrospectorTest
implements JAXBIntrospectorTests<JAXBIntrospector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBIntrospector]

    @Override
    public JAXBIntrospector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.JAXBIntrospector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBIntrospector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBIntrospector]

}

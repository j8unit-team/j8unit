package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.JAXBPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JAXBPermission} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.JAXBPermissionTests}).
 */

@RunWith(J8Unit4.class)
public class JAXBPermissionTest
implements JAXBPermissionTests<JAXBPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

    @Override
    public JAXBPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.JAXBPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.JAXBPermission]

}

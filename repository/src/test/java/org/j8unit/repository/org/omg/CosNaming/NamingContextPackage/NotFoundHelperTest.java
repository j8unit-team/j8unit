package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotFoundHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotFoundHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotFoundHelperTests}).
 */

@RunWith(J8Unit4.class)
public class NotFoundHelperTest
implements NotFoundHelperTests<NotFoundHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundHelper]

    @Override
    public NotFoundHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextPackage.NotFoundHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotFoundHelper]

}

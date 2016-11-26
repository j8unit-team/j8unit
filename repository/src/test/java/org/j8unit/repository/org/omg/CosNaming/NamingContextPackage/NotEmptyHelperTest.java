package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.NotEmptyHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link NotEmptyHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.NotEmptyHelperTests}).
 */
@RunWith(J8Unit4.class)
public class NotEmptyHelperTest
implements NotEmptyHelperTests<NotEmptyHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHelper]

    @Override
    public NotEmptyHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextPackage.NotEmptyHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.NotEmptyHelper]

}

package org.j8unit.repository.org.omg.CosNaming.NamingContextPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextPackage.CannotProceedHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CannotProceedHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.CosNaming.NamingContextPackage.CannotProceedHelperTests}).
 */
@RunWith(J8Unit4.class)
public class CannotProceedHelperTest
implements CannotProceedHelperTests<CannotProceedHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHelper]

    @Override
    public CannotProceedHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextPackage.CannotProceedHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextPackage.CannotProceedHelper]

}

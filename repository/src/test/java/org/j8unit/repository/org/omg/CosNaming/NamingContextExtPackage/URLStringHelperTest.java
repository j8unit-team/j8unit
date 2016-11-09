package org.j8unit.repository.org.omg.CosNaming.NamingContextExtPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtPackage.URLStringHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link URLStringHelper} (by simply reusing
 * the J8Unit test interface {@link URLStringHelperTests}).
 */

@RunWith(J8Unit4.class)
public class URLStringHelperTest
implements URLStringHelperTests<URLStringHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.URLStringHelper]

    @Override
    public URLStringHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.CosNaming.NamingContextExtPackage.URLStringHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.URLStringHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.CosNaming.NamingContextExtPackage.URLStringHelper]

}

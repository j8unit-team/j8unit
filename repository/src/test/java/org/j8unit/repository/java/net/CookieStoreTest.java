package org.j8unit.repository.java.net;

import java.net.CookieStore;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CookieStore} (by simply reusing the
 * J8Unit test interface {@link CookieStoreTests}).
 */

@RunWith(J8Unit4.class)
public class CookieStoreTest
implements CookieStoreTests<CookieStore> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CookieStore]

    @Override
    public CookieStore createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.CookieStore], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.CookieStore]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.CookieStore]

}

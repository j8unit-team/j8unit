package org.j8unit.repository.java.net;

import java.net.CookieStore;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CookieStore} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.net.CookieStoreClassTests}).
 */

@RunWith(J8Unit4.class)
public class CookieStoreClassTest
implements CookieStoreClassTests<CookieStore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CookieStore]

    @Override
    public Class<CookieStore> createNewSUT() {
        return CookieStore.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.CookieStore]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CookieStore]

}

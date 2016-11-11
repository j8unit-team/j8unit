package org.j8unit.repository.java.lang.invoke;

import java.lang.invoke.CallSite;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CallSite} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.invoke.CallSiteClassTests}).
 */

@RunWith(J8Unit4.class)
public class CallSiteClassTest
implements CallSiteClassTests<CallSite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.invoke.CallSite]

    @Override
    public Class<CallSite> createNewSUT() {
        return CallSite.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.invoke.CallSite]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.invoke.CallSite]

}

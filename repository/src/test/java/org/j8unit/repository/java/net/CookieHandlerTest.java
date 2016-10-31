package org.j8unit.repository.java.net;

import java.net.CookieHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieHandlerTest
implements org.j8unit.repository.java.net.CookieHandlerTests<CookieHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.CookieHandler]

    @Override
    public CookieHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.CookieHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.CookieHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.CookieHandler]

}

package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieHandlerClassTest
implements org.j8unit.repository.java.net.CookieHandlerClassTests<java.net.CookieHandler> {

    @Override
    public Class<java.net.CookieHandler> createNewSUT() {
        return java.net.CookieHandler.class;
    }

}

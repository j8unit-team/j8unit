package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HttpCookieClassTest
implements org.j8unit.repository.java.net.HttpCookieClassTests<java.net.HttpCookie> {

    @Override
    public Class<java.net.HttpCookie> createNewSUT() {
        return java.net.HttpCookie.class;
    }

}

package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLStreamHandlerClassTest
implements org.j8unit.repository.java.net.URLStreamHandlerClassTests<java.net.URLStreamHandler> {

    @Override
    public Class<java.net.URLStreamHandler> createNewSUT() {
        return java.net.URLStreamHandler.class;
    }

}

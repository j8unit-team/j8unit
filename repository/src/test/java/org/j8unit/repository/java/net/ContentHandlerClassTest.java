package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContentHandlerClassTest
implements org.j8unit.repository.java.net.ContentHandlerClassTests<java.net.ContentHandler> {

    @Override
    public Class<java.net.ContentHandler> createNewSUT() {
        return java.net.ContentHandler.class;
    }

}

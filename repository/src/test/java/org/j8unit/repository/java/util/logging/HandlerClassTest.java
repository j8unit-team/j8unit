package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerClassTest
implements org.j8unit.repository.java.util.logging.HandlerClassTests<java.util.logging.Handler> {

    @Override
    public Class<java.util.logging.Handler> createNewSUT() {
        return java.util.logging.Handler.class;
    }

}

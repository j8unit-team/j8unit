package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamHandlerClassTest
implements org.j8unit.repository.java.util.logging.StreamHandlerClassTests<java.util.logging.StreamHandler> {

    @Override
    public Class<java.util.logging.StreamHandler> createNewSUT() {
        return java.util.logging.StreamHandler.class;
    }

}

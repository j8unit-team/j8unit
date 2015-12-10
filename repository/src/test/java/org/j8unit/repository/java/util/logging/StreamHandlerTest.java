package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamHandlerTest
implements org.j8unit.repository.java.util.logging.StreamHandlerTests<java.util.logging.StreamHandler> {

    @Override
    public java.util.logging.StreamHandler createNewSUT() {
        return new java.util.logging.StreamHandler();
    }

}

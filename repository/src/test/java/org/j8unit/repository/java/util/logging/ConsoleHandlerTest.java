package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConsoleHandlerTest
implements org.j8unit.repository.java.util.logging.ConsoleHandlerTests<java.util.logging.ConsoleHandler> {

    @Override
    public java.util.logging.ConsoleHandler createNewSUT() {
        return new java.util.logging.ConsoleHandler();
    }

}

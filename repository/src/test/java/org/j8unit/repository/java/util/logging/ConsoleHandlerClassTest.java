package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConsoleHandlerClassTest
implements org.j8unit.repository.java.util.logging.ConsoleHandlerClassTests<java.util.logging.ConsoleHandler> {

    @Override
    public Class<java.util.logging.ConsoleHandler> createNewSUT() {
        return java.util.logging.ConsoleHandler.class;
    }

}

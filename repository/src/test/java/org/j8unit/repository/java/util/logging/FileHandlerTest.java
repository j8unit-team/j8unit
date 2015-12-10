package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileHandlerTest
implements org.j8unit.repository.java.util.logging.FileHandlerTests<java.util.logging.FileHandler> {

    @Override
    public java.util.logging.FileHandler createNewSUT() {
        try {
            return new java.util.logging.FileHandler();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}

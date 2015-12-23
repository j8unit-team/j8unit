package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryHandlerTest
implements org.j8unit.repository.java.util.logging.MemoryHandlerTests<java.util.logging.MemoryHandler> {

    @Override
    public java.util.logging.MemoryHandler createNewSUT() {
        return new java.util.logging.MemoryHandler();
    }

}

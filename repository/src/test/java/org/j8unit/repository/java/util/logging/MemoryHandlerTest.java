package org.j8unit.repository.java.util.logging;

import static org.junit.Assume.assumeTrue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryHandlerTest
implements org.j8unit.repository.java.util.logging.MemoryHandlerTests<java.util.logging.MemoryHandler> {

    @Override
    public java.util.logging.MemoryHandler createNewSUT() {
        assumeTrue("Somebody needs to specify/setup a 'LogManager' at first.", false);
        return new java.util.logging.MemoryHandler();
    }

}

package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MemoryHandlerClassTest
implements org.j8unit.repository.java.util.logging.MemoryHandlerClassTests<java.util.logging.MemoryHandler> {

    @Override
    public Class<java.util.logging.MemoryHandler> createNewSUT() {
        return java.util.logging.MemoryHandler.class;
    }

}

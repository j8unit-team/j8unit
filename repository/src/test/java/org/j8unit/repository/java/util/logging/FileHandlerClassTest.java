package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileHandlerClassTest
implements org.j8unit.repository.java.util.logging.FileHandlerClassTests<java.util.logging.FileHandler> {

    @Override
    public Class<java.util.logging.FileHandler> createNewSUT() {
        return java.util.logging.FileHandler.class;
    }

}

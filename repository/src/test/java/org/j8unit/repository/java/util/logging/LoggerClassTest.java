package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LoggerClassTest
implements org.j8unit.repository.java.util.logging.LoggerClassTests<java.util.logging.Logger> {

    @Override
    public Class<java.util.logging.Logger> createNewSUT() {
        return java.util.logging.Logger.class;
    }

}

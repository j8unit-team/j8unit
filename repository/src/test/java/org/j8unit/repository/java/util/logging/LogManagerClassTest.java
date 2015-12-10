package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LogManagerClassTest
implements org.j8unit.repository.java.util.logging.LogManagerClassTests<java.util.logging.LogManager> {

    @Override
    public Class<java.util.logging.LogManager> createNewSUT() {
        return java.util.logging.LogManager.class;
    }

}

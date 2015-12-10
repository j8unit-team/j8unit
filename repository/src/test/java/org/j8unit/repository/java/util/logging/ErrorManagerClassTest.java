package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorManagerClassTest
implements org.j8unit.repository.java.util.logging.ErrorManagerClassTests<java.util.logging.ErrorManager> {

    @Override
    public Class<java.util.logging.ErrorManager> createNewSUT() {
        return java.util.logging.ErrorManager.class;
    }

}

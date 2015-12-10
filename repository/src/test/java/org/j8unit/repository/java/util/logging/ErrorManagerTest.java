package org.j8unit.repository.java.util.logging;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ErrorManagerTest
implements org.j8unit.repository.java.util.logging.ErrorManagerTests<java.util.logging.ErrorManager> {

    @Override
    public java.util.logging.ErrorManager createNewSUT() {
        return new java.util.logging.ErrorManager();
    }

}

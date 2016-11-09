package org.j8unit.repository.java.beans;

import java.beans.ExceptionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ExceptionListener} (by simply reusing the
 * J8Unit test interface {@link ExceptionListenerClassTests}).
 */

@RunWith(J8Unit4.class)
public class ExceptionListenerClassTest
implements ExceptionListenerClassTests<ExceptionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.ExceptionListener]

    @Override
    public Class<ExceptionListener> createNewSUT() {
        return ExceptionListener.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.ExceptionListener]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.ExceptionListener]

}

package org.j8unit.repository.java.beans;

import java.beans.ExceptionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ExceptionListener} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.beans.ExceptionListenerTests}).
 */

@RunWith(J8Unit4.class)
public class ExceptionListenerTest
implements ExceptionListenerTests<ExceptionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.ExceptionListener]

    @Override
    public ExceptionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.ExceptionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.ExceptionListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.ExceptionListener]

}

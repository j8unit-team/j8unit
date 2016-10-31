package org.j8unit.repository.java.beans;

import java.beans.ExceptionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionListenerTest
implements org.j8unit.repository.java.beans.ExceptionListenerTests<ExceptionListener> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.ExceptionListener]

    @Override
    public ExceptionListener createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.beans.ExceptionListener], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.ExceptionListener]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.ExceptionListener]

}

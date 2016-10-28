package org.j8unit.repository.java.beans;

import java.beans.ExceptionListener;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionListenerClassTest
implements org.j8unit.repository.java.beans.ExceptionListenerClassTests<ExceptionListener> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.ExceptionListener]

    @Override
    public Class<ExceptionListener> createNewSUT() {
        return ExceptionListener.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.ExceptionListener]

}

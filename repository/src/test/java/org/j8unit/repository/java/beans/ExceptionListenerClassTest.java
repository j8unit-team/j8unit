package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionListenerClassTest
implements org.j8unit.repository.java.beans.ExceptionListenerClassTests<java.beans.ExceptionListener> {

    @Override
    public Class<java.beans.ExceptionListener> createNewSUT() {
        return java.beans.ExceptionListener.class;
    }

}
package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObservableTest
implements org.j8unit.repository.java.util.ObservableTests<java.util.Observable> {

    @Override
    public java.util.Observable createNewSUT() {
        return new java.util.Observable();
    }

}
package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CancellationExceptionClassTest
implements org.j8unit.repository.java.util.concurrent.CancellationExceptionClassTests<java.util.concurrent.CancellationException> {

    @Override
    public Class<java.util.concurrent.CancellationException> createNewSUT() {
        return java.util.concurrent.CancellationException.class;
    }

}

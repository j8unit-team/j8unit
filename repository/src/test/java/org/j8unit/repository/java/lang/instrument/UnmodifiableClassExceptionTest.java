package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmodifiableClassExceptionTest
implements org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionTests<java.lang.instrument.UnmodifiableClassException> {

    @Override
    public java.lang.instrument.UnmodifiableClassException createNewSUT() {
        return new java.lang.instrument.UnmodifiableClassException();
    }

}

package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmodifiableClassExceptionClassTest
implements org.j8unit.repository.java.lang.instrument.UnmodifiableClassExceptionClassTests<java.lang.instrument.UnmodifiableClassException> {

    @Override
    public Class<java.lang.instrument.UnmodifiableClassException> createNewSUT() {
        return java.lang.instrument.UnmodifiableClassException.class;
    }

}

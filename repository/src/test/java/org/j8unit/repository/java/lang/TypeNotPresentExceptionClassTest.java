package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeNotPresentExceptionClassTest
implements org.j8unit.repository.java.lang.TypeNotPresentExceptionClassTests<java.lang.TypeNotPresentException> {

    @Override
    public Class<java.lang.TypeNotPresentException> createNewSUT() {
        return java.lang.TypeNotPresentException.class;
    }

}

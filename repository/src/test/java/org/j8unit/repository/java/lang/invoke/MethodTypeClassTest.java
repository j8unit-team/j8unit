package org.j8unit.repository.java.lang.invoke;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodTypeClassTest
implements org.j8unit.repository.java.lang.invoke.MethodTypeClassTests<java.lang.invoke.MethodType> {

    @Override
    public Class<java.lang.invoke.MethodType> createNewSUT() {
        return java.lang.invoke.MethodType.class;
    }

}

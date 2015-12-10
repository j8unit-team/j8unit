package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FunctionalInterfaceClassTest
implements org.j8unit.repository.java.lang.FunctionalInterfaceClassTests<java.lang.FunctionalInterface> {

    @Override
    public Class<java.lang.FunctionalInterface> createNewSUT() {
        return java.lang.FunctionalInterface.class;
    }

}

package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ShortTest
implements org.j8unit.repository.java.lang.ShortTests<java.lang.Short> {

    @Override
    public java.lang.Short createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.Short] available.");
    }

}

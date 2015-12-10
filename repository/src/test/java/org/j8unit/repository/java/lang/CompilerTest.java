package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilerTest
implements org.j8unit.repository.java.lang.CompilerTests<java.lang.Compiler> {

    @Override
    public java.lang.Compiler createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.lang.Compiler] available.");
    }

}

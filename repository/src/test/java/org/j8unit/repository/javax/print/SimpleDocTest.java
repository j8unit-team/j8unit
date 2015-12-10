package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleDocTest
implements org.j8unit.repository.javax.print.SimpleDocTests<javax.print.SimpleDoc> {

    @Override
    public javax.print.SimpleDoc createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.print.SimpleDoc] available.");
    }

}

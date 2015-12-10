package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LSExceptionTest
implements org.j8unit.repository.org.w3c.dom.ls.LSExceptionTests<org.w3c.dom.ls.LSException> {

    @Override
    public org.w3c.dom.ls.LSException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.w3c.dom.ls.LSException] available.");
    }

}

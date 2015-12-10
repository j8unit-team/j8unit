package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionTest
implements org.j8unit.repository.javax.xml.bind.MarshalExceptionTests<javax.xml.bind.MarshalException> {

    @Override
    public javax.xml.bind.MarshalException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.bind.MarshalException] available.");
    }

}

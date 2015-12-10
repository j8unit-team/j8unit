package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeConstraintExceptionTest
implements org.j8unit.repository.javax.xml.bind.TypeConstraintExceptionTests<javax.xml.bind.TypeConstraintException> {

    @Override
    public javax.xml.bind.TypeConstraintException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.xml.bind.TypeConstraintException] available.");
    }

}

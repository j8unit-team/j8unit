package org.j8unit.repository.javax.lang.model.type;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MirroredTypesExceptionTest
implements org.j8unit.repository.javax.lang.model.type.MirroredTypesExceptionTests<javax.lang.model.type.MirroredTypesException> {

    @Override
    public javax.lang.model.type.MirroredTypesException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.lang.model.type.MirroredTypesException] available.");
    }

}

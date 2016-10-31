package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.TypeConstraintException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeConstraintExceptionTest
implements org.j8unit.repository.javax.xml.bind.TypeConstraintExceptionTests<TypeConstraintException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.TypeConstraintException]

    @Override
    public TypeConstraintException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.bind.TypeConstraintException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.TypeConstraintException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.TypeConstraintException]

}

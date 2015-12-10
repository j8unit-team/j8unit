package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeConstraintExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.TypeConstraintExceptionClassTests<javax.xml.bind.TypeConstraintException> {

    @Override
    public Class<javax.xml.bind.TypeConstraintException> createNewSUT() {
        return javax.xml.bind.TypeConstraintException.class;
    }

}

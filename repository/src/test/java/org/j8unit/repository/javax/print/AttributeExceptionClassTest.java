package org.j8unit.repository.javax.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeExceptionClassTest
implements org.j8unit.repository.javax.print.AttributeExceptionClassTests<javax.print.AttributeException> {

    @Override
    public Class<javax.print.AttributeException> createNewSUT() {
        return javax.print.AttributeException.class;
    }

}

package org.j8unit.repository.javax.print;

import javax.print.AttributeException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeExceptionClassTest
implements org.j8unit.repository.javax.print.AttributeExceptionClassTests<AttributeException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.AttributeException]

    @Override
    public Class<AttributeException> createNewSUT() {
        return AttributeException.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.AttributeException]

}

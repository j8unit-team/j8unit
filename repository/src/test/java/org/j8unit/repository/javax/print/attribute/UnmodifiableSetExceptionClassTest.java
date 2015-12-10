package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmodifiableSetExceptionClassTest
implements org.j8unit.repository.javax.print.attribute.UnmodifiableSetExceptionClassTests<javax.print.attribute.UnmodifiableSetException> {

    @Override
    public Class<javax.print.attribute.UnmodifiableSetException> createNewSUT() {
        return javax.print.attribute.UnmodifiableSetException.class;
    }

}

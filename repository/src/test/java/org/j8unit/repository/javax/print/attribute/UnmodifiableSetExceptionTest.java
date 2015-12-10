package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmodifiableSetExceptionTest
implements org.j8unit.repository.javax.print.attribute.UnmodifiableSetExceptionTests<javax.print.attribute.UnmodifiableSetException> {

    @Override
    public javax.print.attribute.UnmodifiableSetException createNewSUT() {
        return new javax.print.attribute.UnmodifiableSetException();
    }

}

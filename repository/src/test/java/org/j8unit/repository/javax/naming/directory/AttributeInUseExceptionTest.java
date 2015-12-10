package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeInUseExceptionTest
implements org.j8unit.repository.javax.naming.directory.AttributeInUseExceptionTests<javax.naming.directory.AttributeInUseException> {

    @Override
    public javax.naming.directory.AttributeInUseException createNewSUT() {
        return new javax.naming.directory.AttributeInUseException();
    }

}

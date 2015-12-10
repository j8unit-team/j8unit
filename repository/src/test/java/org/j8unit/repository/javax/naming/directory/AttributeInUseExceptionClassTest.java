package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeInUseExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.AttributeInUseExceptionClassTests<javax.naming.directory.AttributeInUseException> {

    @Override
    public Class<javax.naming.directory.AttributeInUseException> createNewSUT() {
        return javax.naming.directory.AttributeInUseException.class;
    }

}

package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeModificationExceptionClassTest
implements org.j8unit.repository.javax.naming.directory.AttributeModificationExceptionClassTests<javax.naming.directory.AttributeModificationException> {

    @Override
    public Class<javax.naming.directory.AttributeModificationException> createNewSUT() {
        return javax.naming.directory.AttributeModificationException.class;
    }

}
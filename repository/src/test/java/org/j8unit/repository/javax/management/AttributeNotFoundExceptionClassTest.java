package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.AttributeNotFoundExceptionClassTests<javax.management.AttributeNotFoundException> {

    @Override
    public Class<javax.management.AttributeNotFoundException> createNewSUT() {
        return javax.management.AttributeNotFoundException.class;
    }

}

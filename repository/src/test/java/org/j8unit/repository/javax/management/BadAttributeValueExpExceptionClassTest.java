package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadAttributeValueExpExceptionClassTest
implements org.j8unit.repository.javax.management.BadAttributeValueExpExceptionClassTests<javax.management.BadAttributeValueExpException> {

    @Override
    public Class<javax.management.BadAttributeValueExpException> createNewSUT() {
        return javax.management.BadAttributeValueExpException.class;
    }

}

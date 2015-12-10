package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeValueExpClassTest
implements org.j8unit.repository.javax.management.AttributeValueExpClassTests<javax.management.AttributeValueExp> {

    @Override
    public Class<javax.management.AttributeValueExp> createNewSUT() {
        return javax.management.AttributeValueExp.class;
    }

}

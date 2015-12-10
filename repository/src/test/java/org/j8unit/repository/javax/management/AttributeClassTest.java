package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.management.AttributeClassTests<javax.management.Attribute> {

    @Override
    public Class<javax.management.Attribute> createNewSUT() {
        return javax.management.Attribute.class;
    }

}

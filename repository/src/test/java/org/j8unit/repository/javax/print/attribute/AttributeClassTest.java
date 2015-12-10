package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeClassTest
implements org.j8unit.repository.javax.print.attribute.AttributeClassTests<javax.print.attribute.Attribute> {

    @Override
    public Class<javax.print.attribute.Attribute> createNewSUT() {
        return javax.print.attribute.Attribute.class;
    }

}

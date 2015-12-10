package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedValuesAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.SupportedValuesAttributeClassTests<javax.print.attribute.SupportedValuesAttribute> {

    @Override
    public Class<javax.print.attribute.SupportedValuesAttribute> createNewSUT() {
        return javax.print.attribute.SupportedValuesAttribute.class;
    }

}

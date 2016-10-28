package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.SupportedValuesAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SupportedValuesAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.SupportedValuesAttributeClassTests<SupportedValuesAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.SupportedValuesAttribute]

    @Override
    public Class<SupportedValuesAttribute> createNewSUT() {
        return SupportedValuesAttribute.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.SupportedValuesAttribute]

}

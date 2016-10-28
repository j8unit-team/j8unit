package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintJobAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintJobAttributeClassTests<PrintJobAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintJobAttribute]

    @Override
    public Class<PrintJobAttribute> createNewSUT() {
        return PrintJobAttribute.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintJobAttribute]

}

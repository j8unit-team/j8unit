package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintServiceAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintServiceAttributeClassTests<PrintServiceAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintServiceAttribute]

    @Override
    public Class<PrintServiceAttribute> createNewSUT() {
        return PrintServiceAttribute.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintServiceAttribute]

}

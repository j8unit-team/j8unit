package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintRequestAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintRequestAttributeClassTests<PrintRequestAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintRequestAttribute]

    @Override
    public Class<PrintRequestAttribute> createNewSUT() {
        return PrintRequestAttribute.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintRequestAttribute]

}

package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintRequestAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintRequestAttributeClassTests<javax.print.attribute.PrintRequestAttribute> {

    @Override
    public Class<javax.print.attribute.PrintRequestAttribute> createNewSUT() {
        return javax.print.attribute.PrintRequestAttribute.class;
    }

}

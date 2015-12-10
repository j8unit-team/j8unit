package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintJobAttributeClassTests<javax.print.attribute.PrintJobAttribute> {

    @Override
    public Class<javax.print.attribute.PrintJobAttribute> createNewSUT() {
        return javax.print.attribute.PrintJobAttribute.class;
    }

}

package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeClassTest
implements org.j8unit.repository.javax.print.attribute.PrintServiceAttributeClassTests<javax.print.attribute.PrintServiceAttribute> {

    @Override
    public Class<javax.print.attribute.PrintServiceAttribute> createNewSUT() {
        return javax.print.attribute.PrintServiceAttribute.class;
    }

}

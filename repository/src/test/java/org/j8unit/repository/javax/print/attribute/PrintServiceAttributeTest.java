package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintServiceAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintServiceAttributeTest
implements org.j8unit.repository.javax.print.attribute.PrintServiceAttributeTests<PrintServiceAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintServiceAttribute]

    @Override
    public PrintServiceAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintServiceAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintServiceAttribute]

}

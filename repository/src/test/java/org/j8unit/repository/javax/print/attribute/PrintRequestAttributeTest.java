package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintRequestAttributeTest
implements org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests<PrintRequestAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintRequestAttribute]

    @Override
    public PrintRequestAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.PrintRequestAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.PrintRequestAttribute]

}

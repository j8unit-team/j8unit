package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.SupportedValuesAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SupportedValuesAttribute} (by simply
 * reusing the J8Unit test interface {@link SupportedValuesAttributeTests}).
 */

@RunWith(J8Unit4.class)
public class SupportedValuesAttributeTest
implements SupportedValuesAttributeTests<SupportedValuesAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.SupportedValuesAttribute]

    @Override
    public SupportedValuesAttribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.SupportedValuesAttribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.SupportedValuesAttribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.SupportedValuesAttribute]

}

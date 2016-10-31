package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.AttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeSetTest
implements org.j8unit.repository.javax.print.attribute.AttributeSetTests<AttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.AttributeSet]

    @Override
    public AttributeSet createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.attribute.AttributeSet], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.AttributeSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.AttributeSet]

}

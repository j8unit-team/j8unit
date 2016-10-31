package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleText;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessibleTextTest
implements org.j8unit.repository.javax.accessibility.AccessibleTextTests<AccessibleText> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleText]

    @Override
    public AccessibleText createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleText], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleText]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleText]

}

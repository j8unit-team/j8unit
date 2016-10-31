package org.j8unit.repository.javax.annotation;

import javax.annotation.Resources;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResourcesTest
implements org.j8unit.repository.javax.annotation.ResourcesTests<Resources> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.annotation.Resources]

    @Override
    public Resources createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.annotation.Resources], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.annotation.Resources]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.annotation.Resources]

}

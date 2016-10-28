package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformManagedObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlatformManagedObjectTest
implements org.j8unit.repository.java.lang.management.PlatformManagedObjectTests<PlatformManagedObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.PlatformManagedObject]

    @Override
    public PlatformManagedObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.management.PlatformManagedObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.management.PlatformManagedObject]

}

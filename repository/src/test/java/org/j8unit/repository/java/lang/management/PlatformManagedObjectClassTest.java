package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformManagedObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PlatformManagedObject} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.lang.management.PlatformManagedObjectClassTests}).
 */
@RunWith(J8Unit4.class)
public class PlatformManagedObjectClassTest
implements PlatformManagedObjectClassTests<PlatformManagedObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.PlatformManagedObject]

    @Override
    public Class<PlatformManagedObject> createNewSUT() {
        return PlatformManagedObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.management.PlatformManagedObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.PlatformManagedObject]

}

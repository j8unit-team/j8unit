package org.j8unit.repository.java.lang.management;

import java.lang.management.PlatformManagedObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PlatformManagedObjectClassTest
implements org.j8unit.repository.java.lang.management.PlatformManagedObjectClassTests<PlatformManagedObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.management.PlatformManagedObject]

    @Override
    public Class<PlatformManagedObject> createNewSUT() {
        return PlatformManagedObject.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.management.PlatformManagedObject]

}

package org.j8unit.repository.java.security;

import java.security.PermissionCollection;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionCollectionTest
implements org.j8unit.repository.java.security.PermissionCollectionTests<PermissionCollection> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PermissionCollection]

    @Override
    public PermissionCollection createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.PermissionCollection], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PermissionCollection]

}

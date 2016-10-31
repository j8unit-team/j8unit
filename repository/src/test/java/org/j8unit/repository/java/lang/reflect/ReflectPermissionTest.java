package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.ReflectPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReflectPermissionTest
implements org.j8unit.repository.java.lang.reflect.ReflectPermissionTests<ReflectPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.ReflectPermission]

    @Override
    public ReflectPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.reflect.ReflectPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.ReflectPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.ReflectPermission]

}

package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ReflectPermissionClassTest
implements org.j8unit.repository.java.lang.reflect.ReflectPermissionClassTests<java.lang.reflect.ReflectPermission> {

    @Override
    public Class<java.lang.reflect.ReflectPermission> createNewSUT() {
        return java.lang.reflect.ReflectPermission.class;
    }

}

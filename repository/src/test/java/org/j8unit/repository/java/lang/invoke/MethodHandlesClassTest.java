package org.j8unit.repository.java.lang.invoke;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MethodHandlesClassTest
implements org.j8unit.repository.java.lang.invoke.MethodHandlesClassTests<java.lang.invoke.MethodHandles> {

    @Override
    public Class<java.lang.invoke.MethodHandles> createNewSUT() {
        return java.lang.invoke.MethodHandles.class;
    }

    @RunWith(J8Unit4.class)
    public static class LookupClassTest
    implements org.j8unit.repository.java.lang.invoke.MethodHandlesClassTests.LookupClassTests<java.lang.invoke.MethodHandles.Lookup> {

        @Override
        public Class<java.lang.invoke.MethodHandles.Lookup> createNewSUT() {
            return java.lang.invoke.MethodHandles.Lookup.class;
        }

    }

}

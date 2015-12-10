package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyRepClassTest
implements org.j8unit.repository.java.security.KeyRepClassTests<java.security.KeyRep> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.java.security.KeyRepClassTests.TypeClassTests<java.security.KeyRep.Type> {

        @Override
        public Class<java.security.KeyRep.Type> createNewSUT() {
            return java.security.KeyRep.Type.class;
        }

    }

    @Override
    public Class<java.security.KeyRep> createNewSUT() {
        return java.security.KeyRep.class;
    }

}

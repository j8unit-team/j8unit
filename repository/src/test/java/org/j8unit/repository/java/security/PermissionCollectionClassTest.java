package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PermissionCollectionClassTest
implements org.j8unit.repository.java.security.PermissionCollectionClassTests<java.security.PermissionCollection> {

    @Override
    public Class<java.security.PermissionCollection> createNewSUT() {
        return java.security.PermissionCollection.class;
    }

}

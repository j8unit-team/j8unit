package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UserPrincipalClassTest
implements org.j8unit.repository.java.nio.file.attribute.UserPrincipalClassTests<UserPrincipal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.UserPrincipal]

    @Override
    public Class<UserPrincipal> createNewSUT() {
        return UserPrincipal.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.UserPrincipal]

}

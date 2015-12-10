package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclFileAttributeViewClassTest
implements org.j8unit.repository.java.nio.file.attribute.AclFileAttributeViewClassTests<java.nio.file.attribute.AclFileAttributeView> {

    @Override
    public Class<java.nio.file.attribute.AclFileAttributeView> createNewSUT() {
        return java.nio.file.attribute.AclFileAttributeView.class;
    }

}

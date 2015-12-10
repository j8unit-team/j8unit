package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryClassTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryClassTests<java.nio.file.attribute.AclEntry> {

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryClassTests.BuilderClassTests<java.nio.file.attribute.AclEntry.Builder> {

        @Override
        public Class<java.nio.file.attribute.AclEntry.Builder> createNewSUT() {
            return java.nio.file.attribute.AclEntry.Builder.class;
        }

    }

    @Override
    public Class<java.nio.file.attribute.AclEntry> createNewSUT() {
        return java.nio.file.attribute.AclEntry.class;
    }

}

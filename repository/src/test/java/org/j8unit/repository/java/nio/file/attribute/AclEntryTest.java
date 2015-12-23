package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests<java.nio.file.attribute.AclEntry> {

    @Override
    public java.nio.file.attribute.AclEntry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.nio.file.attribute.AclEntry] available.");
    }

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests.BuilderTests<java.nio.file.attribute.AclEntry.Builder> {

        @Override
        public java.nio.file.attribute.AclEntry.Builder createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [java.nio.file.attribute.AclEntry.Builder] available.");
        }

    }

}

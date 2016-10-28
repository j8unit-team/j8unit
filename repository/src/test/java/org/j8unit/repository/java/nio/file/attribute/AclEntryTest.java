package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntry.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry]

    @Override
    public AclEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.AclEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry]

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.AclEntry.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry$Builder]

    }

}

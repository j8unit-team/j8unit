package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntry.Builder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AclEntry} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.AclEntryTests}).
 */

@RunWith(J8Unit4.class)
public class AclEntryTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry]

    @Override
    public AclEntry createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.AclEntry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.attribute.AclEntry]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.attribute.AclEntry]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Builder} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.nio.file.attribute.AclEntryTests.BuilderTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BuilderTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryTests.BuilderTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.file.attribute.AclEntry$Builder]

        @Override
        public Builder createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.file.attribute.AclEntry.Builder], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.file.attribute.AclEntry$Builder]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.file.attribute.AclEntry$Builder]

    }

}

package org.j8unit.repository.java.nio.file.attribute;

import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntry.Builder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclEntryClassTest
implements org.j8unit.repository.java.nio.file.attribute.AclEntryClassTests<AclEntry> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.AclEntry]

    @Override
    public Class<AclEntry> createNewSUT() {
        return AclEntry.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.nio.file.attribute.AclEntry#newBuilder(java.nio.file.attribute.AclEntry) public static
     * java.nio.file.attribute.AclEntry$Builder
     * java.nio.file.attribute.AclEntry.newBuilder(java.nio.file.attribute.AclEntry)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBuilder_AclEntry()
    throws Exception {
        // write some test for {@link java.nio.file.attribute.AclEntry#newBuilder(java.nio.file.attribute.AclEntry)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.nio.file.attribute.AclEntry#newBuilder() public
     * static java.nio.file.attribute.AclEntry$Builder java.nio.file.attribute.AclEntry.newBuilder()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_newBuilder()
    throws Exception {
        // write some test for {@link java.nio.file.attribute.AclEntry#newBuilder()}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.AclEntry]

    @RunWith(J8Unit4.class)
    public static class BuilderClassTest
    implements org.j8unit.repository.java.nio.file.attribute.AclEntryClassTests.BuilderClassTests<Builder> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.attribute.AclEntry$Builder]

        @Override
        public Class<Builder> createNewSUT() {
            return Builder.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.attribute.AclEntry$Builder]

    }

}

package org.j8unit.repository.java.io;

import java.io.SerializablePermission;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SerializablePermission} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.io.SerializablePermissionClassTests}).
 */
@RunWith(J8Unit4.class)
public class SerializablePermissionClassTest
implements SerializablePermissionClassTests<SerializablePermission> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.SerializablePermission]

    @Override
    public Class<SerializablePermission> createNewSUT() {
        return SerializablePermission.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.SerializablePermission#SerializablePermission(String) public
     * java.io.SerializablePermission(java.lang.String)}.
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
    public void create_SerializablePermission_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerializablePermission sut = null; // = new SerializablePermission(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.SerializablePermission#SerializablePermission(String, String) public
     * java.io.SerializablePermission(java.lang.String,java.lang.String)}.
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
    public void create_SerializablePermission_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SerializablePermission sut = null; // = new SerializablePermission(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.SerializablePermission]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.SerializablePermission]

}

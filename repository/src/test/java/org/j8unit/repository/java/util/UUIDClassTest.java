package org.j8unit.repository.java.util;

import java.util.UUID;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UUIDClassTest
implements org.j8unit.repository.java.util.UUIDClassTests<UUID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.UUID]

    @Override
    public Class<UUID> createNewSUT() {
        return UUID.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.UUID#UUID(long, long) public
     * java.util.UUID(long,long)}.
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
    public void create_UUID_long_long()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UUID sut = null; // = new UUID(long, long);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.UUID#nameUUIDFromBytes(byte[]) public
     * static java.util.UUID java.util.UUID.nameUUIDFromBytes(byte[])}.
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
    public void test_nameUUIDFromBytes_byteArray()
    throws Exception {
        // write some test for {@link java.util.UUID#nameUUIDFromBytes(byte[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.UUID#fromString(String) public static
     * java.util.UUID java.util.UUID.fromString(java.lang.String)}.
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
    public void test_fromString_String()
    throws Exception {
        // write some test for {@link java.util.UUID#fromString(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.util.UUID#randomUUID() public static
     * java.util.UUID java.util.UUID.randomUUID()}.
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
    public void test_randomUUID()
    throws Exception {
        // write some test for {@link java.util.UUID#randomUUID()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.UUID]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.UUID]

}

package org.j8unit.repository.javax.management;

import javax.management.ImmutableDescriptor;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ImmutableDescriptor} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.ImmutableDescriptorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ImmutableDescriptorClassTest
implements ImmutableDescriptorClassTests<ImmutableDescriptor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ImmutableDescriptor]

    @Override
    public Class<ImmutableDescriptor> createNewSUT() {
        return ImmutableDescriptor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ImmutableDescriptor#ImmutableDescriptor(java.util.Map) public
     * javax.management.ImmutableDescriptor(java.util.Map<java.lang.String, ?>)}.
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
    public void create_ImmutableDescriptor_Map()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ImmutableDescriptor sut = null; // = new ImmutableDescriptor(java.util.Map);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ImmutableDescriptor#ImmutableDescriptor(String...) public
     * javax.management.ImmutableDescriptor(java.lang.String...)}.
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
    public void create_ImmutableDescriptor_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ImmutableDescriptor sut = null; // = new ImmutableDescriptor(String...);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ImmutableDescriptor#ImmutableDescriptor(String[], Object[]) public
     * javax.management.ImmutableDescriptor(java.lang.String[],java.lang.Object[])}.
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
    public void create_ImmutableDescriptor_StringArray_ObjectArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ImmutableDescriptor sut = null; // = new ImmutableDescriptor(String[], Object[]);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.ImmutableDescriptor#union(javax.management.Descriptor...) public static
     * javax.management.ImmutableDescriptor javax.management.ImmutableDescriptor.union(javax.management.Descriptor...)}.
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
    public void test_union_DescriptorArray()
    throws Exception {
        // write some test for {@link javax.management.ImmutableDescriptor#union(javax.management.Descriptor...)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.ImmutableDescriptor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ImmutableDescriptor]

}

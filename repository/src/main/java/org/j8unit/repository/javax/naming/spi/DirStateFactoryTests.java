package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.naming.spi.DirStateFactory interface
 * javax.naming.spi.DirStateFactory}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.naming.spi.DirStateFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DirStateFactoryTests<SUT extends javax.naming.spi.DirStateFactory>
extends org.j8unit.repository.javax.naming.spi.StateFactoryTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.naming.spi.DirStateFactory.Result class
     * javax.naming.spi.DirStateFactory$Result}, containing all instance relevant test methods (i.&thinsp;e., test
     * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
     * methods is {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryTests.ResultTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests.ResultClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.naming.spi.DirStateFactory.Result
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ResultTests<SUT extends javax.naming.spi.DirStateFactory.Result>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.naming.spi.DirStateFactory.Result#getAttributes() public
         * javax.naming.directory.Attributes javax.naming.spi.DirStateFactory$Result.getAttributes()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.naming.spi.DirStateFactory.Result#getAttributes()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getAttributes()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.naming.spi.DirStateFactory.Result#getObject() public java.lang.Object
         * javax.naming.spi.DirStateFactory$Result.getObject()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.naming.spi.DirStateFactory.Result#getObject()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getObject()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.DirStateFactory#getStateToBind(java.lang.Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable, javax.naming.directory.Attributes)
     * public abstract javax.naming.spi.DirStateFactory$Result
     * javax.naming.spi.DirStateFactory.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable,javax.naming.directory.Attributes)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.naming.spi.DirStateFactory#getStateToBind(java.lang.Object, javax.naming.Name,
     *             javax.naming.Context, java.util.Hashtable, javax.naming.directory.Attributes)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateToBind_Object_Name_Context_Hashtable_Attributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

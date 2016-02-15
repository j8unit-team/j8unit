package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.ValidationEvent interface javax.xml.bind.ValidationEvent}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ValidationEventClassTests}.
 * </p>
 *
 * @see javax.xml.bind.ValidationEvent interface javax.xml.bind.ValidationEvent (the hereby targeted class-under-test
 *      class)
 * @see ValidationEventClassTests ValidationEventClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationEventTests<SUT extends javax.xml.bind.ValidationEvent>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getLinkedException() public abstract java.lang.Throwable
     * javax.xml.bind.ValidationEvent.getLinkedException()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getLinkedException() public abstract java.lang.Throwable
     * javax.xml.bind.ValidationEvent.getLinkedException()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.ValidationEvent#getLinkedException() public abstract java.lang.Throwable
     *      javax.xml.bind.ValidationEvent.getLinkedException() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLinkedException()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getSeverity() public abstract int
     * javax.xml.bind.ValidationEvent.getSeverity()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getSeverity() public abstract int
     * javax.xml.bind.ValidationEvent.getSeverity()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.ValidationEvent#getSeverity() public abstract int
     *      javax.xml.bind.ValidationEvent.getSeverity() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSeverity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getMessage() public abstract java.lang.String
     * javax.xml.bind.ValidationEvent.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getMessage() public abstract java.lang.String
     * javax.xml.bind.ValidationEvent.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.ValidationEvent#getMessage() public abstract java.lang.String
     *      javax.xml.bind.ValidationEvent.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getLocator() public abstract
     * javax.xml.bind.ValidationEventLocator javax.xml.bind.ValidationEvent.getLocator()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.ValidationEvent#getLocator() public abstract
     * javax.xml.bind.ValidationEventLocator javax.xml.bind.ValidationEvent.getLocator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.ValidationEvent#getLocator() public abstract javax.xml.bind.ValidationEventLocator
     *      javax.xml.bind.ValidationEvent.getLocator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLocator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.util.ValidationEventCollector class
 * javax.xml.bind.util.ValidationEventCollector}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ValidationEventCollectorClassTests}.
 * </p>
 *
 * @see javax.xml.bind.util.ValidationEventCollector class javax.xml.bind.util.ValidationEventCollector (the hereby
 *      targeted class-under-test class)
 * @see ValidationEventCollectorClassTests ValidationEventCollectorClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ValidationEventCollectorTests<SUT extends javax.xml.bind.util.ValidationEventCollector>
extends org.j8unit.repository.javax.xml.bind.ValidationEventHandlerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#getEvents() public
     * javax.xml.bind.ValidationEvent[] javax.xml.bind.util.ValidationEventCollector.getEvents()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#getEvents() public
     * javax.xml.bind.ValidationEvent[] javax.xml.bind.util.ValidationEventCollector.getEvents()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.util.ValidationEventCollector#getEvents() public javax.xml.bind.ValidationEvent[]
     *      javax.xml.bind.util.ValidationEventCollector.getEvents() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEvents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#handleEvent(javax.xml.bind.ValidationEvent)
     * public boolean javax.xml.bind.util.ValidationEventCollector.handleEvent(javax.xml.bind.ValidationEvent)}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#handleEvent(javax.xml.bind.ValidationEvent)
     * public boolean javax.xml.bind.util.ValidationEventCollector.handleEvent(javax.xml.bind.ValidationEvent)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.util.ValidationEventCollector#handleEvent(javax.xml.bind.ValidationEvent) public boolean
     *      javax.xml.bind.util.ValidationEventCollector.handleEvent(javax.xml.bind.ValidationEvent) (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_handleEvent_ValidationEvent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#hasEvents() public boolean
     * javax.xml.bind.util.ValidationEventCollector.hasEvents()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#hasEvents() public boolean
     * javax.xml.bind.util.ValidationEventCollector.hasEvents()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.util.ValidationEventCollector#hasEvents() public boolean
     *      javax.xml.bind.util.ValidationEventCollector.hasEvents() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasEvents()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#reset() public void
     * javax.xml.bind.util.ValidationEventCollector.reset()}.
     *
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#reset() public void
     * javax.xml.bind.util.ValidationEventCollector.reset()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.bind.util.ValidationEventCollector#reset() public void
     *      javax.xml.bind.util.ValidationEventCollector.reset() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reset()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

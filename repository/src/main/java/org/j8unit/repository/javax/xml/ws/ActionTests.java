package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.ws.Action interface javax.xml.ws.Action}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link ActionClassTests}.
 * </p>
 *
 * @see javax.xml.ws.Action interface javax.xml.ws.Action (the hereby targeted class-under-test class)
 * @see ActionClassTests ActionClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ActionTests<SUT extends javax.xml.ws.Action>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Action#input() public abstract java.lang.String javax.xml.ws.Action.input()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Action#input() public abstract java.lang.String javax.xml.ws.Action.input()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Action#input() public abstract java.lang.String javax.xml.ws.Action.input() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_input()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Action#output() public abstract java.lang.String
     * javax.xml.ws.Action.output()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Action#output() public abstract java.lang.String
     * javax.xml.ws.Action.output()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Action#output() public abstract java.lang.String javax.xml.ws.Action.output() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_output()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Action#fault() public abstract javax.xml.ws.FaultAction[]
     * javax.xml.ws.Action.fault()}.
     *
     * <p>
     * Test method for {@link javax.xml.ws.Action#fault() public abstract javax.xml.ws.FaultAction[]
     * javax.xml.ws.Action.fault()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.ws.Action#fault() public abstract javax.xml.ws.FaultAction[] javax.xml.ws.Action.fault() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_fault()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

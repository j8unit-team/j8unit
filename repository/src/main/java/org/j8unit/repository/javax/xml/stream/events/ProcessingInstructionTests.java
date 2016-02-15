package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.stream.events.ProcessingInstruction interface
 * javax.xml.stream.events.ProcessingInstruction}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link ProcessingInstructionClassTests}.
 * </p>
 *
 * @see javax.xml.stream.events.ProcessingInstruction interface javax.xml.stream.events.ProcessingInstruction (the
 *      hereby targeted class-under-test class)
 * @see ProcessingInstructionClassTests ProcessingInstructionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProcessingInstructionTests<SUT extends javax.xml.stream.events.ProcessingInstruction>
extends XMLEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.ProcessingInstruction#getTarget() public abstract java.lang.String
     * javax.xml.stream.events.ProcessingInstruction.getTarget()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.ProcessingInstruction#getTarget() public abstract java.lang.String
     * javax.xml.stream.events.ProcessingInstruction.getTarget()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.ProcessingInstruction#getTarget() public abstract java.lang.String
     *      javax.xml.stream.events.ProcessingInstruction.getTarget() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.ProcessingInstruction#getData() public abstract java.lang.String
     * javax.xml.stream.events.ProcessingInstruction.getData()}.
     *
     * <p>
     * Test method for {@link javax.xml.stream.events.ProcessingInstruction#getData() public abstract java.lang.String
     * javax.xml.stream.events.ProcessingInstruction.getData()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.stream.events.ProcessingInstruction#getData() public abstract java.lang.String
     *      javax.xml.stream.events.ProcessingInstruction.getData() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getData()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

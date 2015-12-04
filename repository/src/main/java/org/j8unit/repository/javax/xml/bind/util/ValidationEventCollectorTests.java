package org.j8unit.repository.javax.xml.bind.util;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.util.ValidationEventCollector class javax.xml.bind.util.ValidationEventCollector},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.util.ValidationEventCollectorClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ValidationEventCollectorTests<SUT extends javax.xml.bind.util.ValidationEventCollector>
extends org.j8unit.repository.javax.xml.bind.ValidationEventHandlerTests<SUT>,
        org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#getEvents() public javax.xml.bind.ValidationEvent[] javax.xml.bind.util.ValidationEventCollector.getEvents()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getEvents() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#handleEvent(javax.xml.bind.ValidationEvent) public boolean javax.xml.bind.util.ValidationEventCollector.handleEvent(javax.xml.bind.ValidationEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_handleEvent_ValidationEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#hasEvents() public boolean javax.xml.bind.util.ValidationEventCollector.hasEvents()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hasEvents() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.util.ValidationEventCollector#reset() public void javax.xml.bind.util.ValidationEventCollector.reset()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_reset() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

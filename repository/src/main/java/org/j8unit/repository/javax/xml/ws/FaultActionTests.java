package org.j8unit.repository.javax.xml.ws;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.FaultAction interface javax.xml.ws.FaultAction},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.FaultActionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FaultActionTests<SUT extends javax.xml.ws.FaultAction>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.FaultAction#value() public abstract java.lang.String javax.xml.ws.FaultAction.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.ws.FaultAction#className() public abstract java.lang.Class javax.xml.ws.FaultAction.className()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_className() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

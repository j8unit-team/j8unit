package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.bind.annotation.adapters.CollapsedStringAdapter class javax.xml.bind.annotation.adapters.CollapsedStringAdapter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.annotation.adapters.CollapsedStringAdapterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CollapsedStringAdapterTests<SUT extends javax.xml.bind.annotation.adapters.CollapsedStringAdapter>
extends org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterTests<SUT,java.lang.String,java.lang.String>
{

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.CollapsedStringAdapter#marshal(java.lang.String) public java.lang.String javax.xml.bind.annotation.adapters.CollapsedStringAdapter.marshal(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.CollapsedStringAdapter#unmarshal(java.lang.String) public java.lang.String javax.xml.bind.annotation.adapters.CollapsedStringAdapter.unmarshal(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.xml.stream.events;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.stream.events.EntityReference interface javax.xml.stream.events.EntityReference},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.stream.events.EntityReferenceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface EntityReferenceTests<SUT extends javax.xml.stream.events.EntityReference>
extends org.j8unit.repository.javax.xml.stream.events.XMLEventTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.EntityReference#getDeclaration() public abstract
     * javax.xml.stream.events.EntityDeclaration javax.xml.stream.events.EntityReference.getDeclaration()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDeclaration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.stream.events.EntityReference#getName() public abstract java.lang.String
     * javax.xml.stream.events.EntityReference.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

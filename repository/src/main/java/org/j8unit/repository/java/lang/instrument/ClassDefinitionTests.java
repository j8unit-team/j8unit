package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.lang.instrument.ClassDefinition class java.lang.instrument.ClassDefinition}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.lang.instrument.ClassDefinitionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ClassDefinitionTests<SUT extends java.lang.instrument.ClassDefinition>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.instrument.ClassDefinition#getDefinitionClassFile() public byte[]
     * java.lang.instrument.ClassDefinition.getDefinitionClassFile()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefinitionClassFile()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.lang.instrument.ClassDefinition#getDefinitionClass() public java.lang.Class
     * java.lang.instrument.ClassDefinition.getDefinitionClass()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefinitionClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

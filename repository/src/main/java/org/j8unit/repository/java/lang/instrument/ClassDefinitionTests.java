package org.j8unit.repository.java.lang.instrument;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.lang.instrument.ClassDefinition class
 * java.lang.instrument.ClassDefinition}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link ClassDefinitionClassTests}.
 * </p>
 *
 * @see java.lang.instrument.ClassDefinition class java.lang.instrument.ClassDefinition (the hereby targeted
 *      class-under-test class)
 * @see ClassDefinitionClassTests ClassDefinitionClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ClassDefinitionTests<SUT extends java.lang.instrument.ClassDefinition>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.lang.instrument.ClassDefinition#getDefinitionClassFile() public byte[]
     * java.lang.instrument.ClassDefinition.getDefinitionClassFile()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.ClassDefinition#getDefinitionClassFile() public byte[]
     * java.lang.instrument.ClassDefinition.getDefinitionClassFile()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.ClassDefinition#getDefinitionClassFile() public byte[]
     *      java.lang.instrument.ClassDefinition.getDefinitionClassFile() (the hereby targeted method-under-test)
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
     * <?> java.lang.instrument.ClassDefinition.getDefinitionClass()}.
     *
     * <p>
     * Test method for {@link java.lang.instrument.ClassDefinition#getDefinitionClass() public java.lang.Class
     * java.lang.instrument.ClassDefinition.getDefinitionClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.lang.instrument.ClassDefinition#getDefinitionClass() public java.lang.Class
     *      java.lang.instrument.ClassDefinition.getDefinitionClass() (the hereby targeted method-under-test)
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

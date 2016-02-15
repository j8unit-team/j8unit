package org.j8unit.repository.javax.xml.validation;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.validation.SchemaFactoryLoader class
 * javax.xml.validation.SchemaFactoryLoader}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SchemaFactoryLoaderClassTests}.
 * </p>
 *
 * @see javax.xml.validation.SchemaFactoryLoader class javax.xml.validation.SchemaFactoryLoader (the hereby targeted
 *      class-under-test class)
 * @see SchemaFactoryLoaderClassTests SchemaFactoryLoaderClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SchemaFactoryLoaderTests<SUT extends javax.xml.validation.SchemaFactoryLoader>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.validation.SchemaFactoryLoader#newFactory(String) public abstract
     * javax.xml.validation.SchemaFactory javax.xml.validation.SchemaFactoryLoader.newFactory(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.validation.SchemaFactoryLoader#newFactory(String) public abstract
     * javax.xml.validation.SchemaFactory javax.xml.validation.SchemaFactoryLoader.newFactory(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.validation.SchemaFactoryLoader#newFactory(String) public abstract
     *      javax.xml.validation.SchemaFactory javax.xml.validation.SchemaFactoryLoader.newFactory(java.lang.String)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newFactory_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.spi.Resolver interface javax.naming.spi.Resolver}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ResolverClassTests}.
 * </p>
 *
 * @see javax.naming.spi.Resolver interface javax.naming.spi.Resolver (the hereby targeted class-under-test class)
 * @see ResolverClassTests ResolverClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ResolverTests<SUT extends javax.naming.spi.Resolver>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.naming.spi.Resolver#resolveToClass(javax.naming.Name, Class) public abstract
     * javax.naming.spi.ResolveResult javax.naming.spi.Resolver.resolveToClass(javax.naming.Name,java.lang.Class<?
     * extends javax.naming.Context>) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.spi.Resolver#resolveToClass(javax.naming.Name, Class) public abstract
     * javax.naming.spi.ResolveResult javax.naming.spi.Resolver.resolveToClass(javax.naming.Name,java.lang.Class) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.spi.Resolver#resolveToClass(javax.naming.Name, Class) public abstract
     *      javax.naming.spi.ResolveResult javax.naming.spi.Resolver.resolveToClass(javax.naming.Name,java.lang.Class)
     *      throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveToClass_Name_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.naming.spi.Resolver#resolveToClass(String, Class) public abstract
     * javax.naming.spi.ResolveResult javax.naming.spi.Resolver.resolveToClass(java.lang.String,java.lang.Class<?
     * extends javax.naming.Context>) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for {@link javax.naming.spi.Resolver#resolveToClass(String, Class) public abstract
     * javax.naming.spi.ResolveResult javax.naming.spi.Resolver.resolveToClass(java.lang.String,java.lang.Class) throws
     * javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.spi.Resolver#resolveToClass(String, Class) public abstract javax.naming.spi.ResolveResult
     *      javax.naming.spi.Resolver.resolveToClass(java.lang.String,java.lang.Class) throws
     *      javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveToClass_String_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

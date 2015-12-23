package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.w3c.dom.ls.LSResourceResolver interface
 * org.w3c.dom.ls.LSResourceResolver}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.w3c.dom.ls.LSResourceResolverTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.w3c.dom.ls.LSResourceResolverClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.w3c.dom.ls.LSResourceResolver
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LSResourceResolverTests<SUT extends org.w3c.dom.ls.LSResourceResolver>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.w3c.dom.ls.LSResourceResolver#resolveResource(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     * public abstract org.w3c.dom.ls.LSInput
     * org.w3c.dom.ls.LSResourceResolver.resolveResource(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.w3c.dom.ls.LSResourceResolver#resolveResource(java.lang.String, java.lang.String,
     *             java.lang.String, java.lang.String, java.lang.String)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolveResource_String_String_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

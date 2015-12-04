package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.security.URIParameter class java.security.URIParameter}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.security.URIParameterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface URIParameterTests<SUT extends java.security.URIParameter>
extends org.j8unit.repository.java.security.PolicyTests.ParametersTests<SUT>,
org.j8unit.repository.javax.security.auth.login.ConfigurationTests.ParametersTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.URIParameter#getURI() public java.net.URI
     * java.security.URIParameter.getURI()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

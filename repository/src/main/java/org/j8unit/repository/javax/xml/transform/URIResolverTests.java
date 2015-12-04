package org.j8unit.repository.javax.xml.transform;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.transform.URIResolver interface javax.xml.transform.URIResolver},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.URIResolverClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface URIResolverTests<SUT extends javax.xml.transform.URIResolver>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.transform.URIResolver#resolve(java.lang.String,java.lang.String) public abstract javax.xml.transform.Source javax.xml.transform.URIResolver.resolve(java.lang.String,java.lang.String) throws javax.xml.transform.TransformerException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_resolve_String_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

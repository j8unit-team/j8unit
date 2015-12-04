package org.j8unit.repository.java.net;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.net.FileNameMap interface java.net.FileNameMap},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.net.FileNameMapClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface FileNameMapTests<SUT extends java.net.FileNameMap>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.net.FileNameMap#getContentTypeFor(java.lang.String) public abstract java.lang.String java.net.FileNameMap.getContentTypeFor(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContentTypeFor_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

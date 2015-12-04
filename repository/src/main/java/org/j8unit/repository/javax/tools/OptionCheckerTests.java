package org.j8unit.repository.javax.tools;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.tools.OptionChecker interface javax.tools.OptionChecker},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.OptionCheckerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface OptionCheckerTests<SUT extends javax.tools.OptionChecker>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.tools.OptionChecker#isSupportedOption(java.lang.String) public abstract int javax.tools.OptionChecker.isSupportedOption(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupportedOption_String() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

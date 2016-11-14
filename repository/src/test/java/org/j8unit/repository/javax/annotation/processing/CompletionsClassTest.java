package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Completions;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Completions} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.annotation.processing.CompletionsClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompletionsClassTest
implements CompletionsClassTests<Completions> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Completions]

    @Override
    public Class<Completions> createNewSUT() {
        return Completions.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.annotation.processing.Completions#of(String, String) public static
     * javax.annotation.processing.Completion
     * javax.annotation.processing.Completions.of(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_of_String_String()
    throws Exception {
        // write some test for {@link javax.annotation.processing.Completions#of(String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.annotation.processing.Completions#of(String)
     * public static javax.annotation.processing.Completion
     * javax.annotation.processing.Completions.of(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void test_of_String()
    throws Exception {
        // write some test for {@link javax.annotation.processing.Completions#of(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.annotation.processing.Completions]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Completions]

}

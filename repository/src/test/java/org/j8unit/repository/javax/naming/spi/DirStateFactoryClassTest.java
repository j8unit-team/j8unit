package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DirStateFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class DirStateFactoryClassTest
implements DirStateFactoryClassTests<DirStateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirStateFactory]

    @Override
    public Class<DirStateFactory> createNewSUT() {
        return DirStateFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.DirStateFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirStateFactory]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Result} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests.ResultClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class ResultClassTest
    implements ResultClassTests<Result> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirStateFactory$Result]

        @Override
        public Class<Result> createNewSUT() {
            return Result.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.naming.spi.DirStateFactory.Result#Result(Object, javax.naming.directory.Attributes) public
         * javax.naming.spi.DirStateFactory$Result(java.lang.Object,javax.naming.directory.Attributes)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_Result_Object_Attributes()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Result sut = null; // = new Result(Object, javax.naming.directory.Attributes);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.spi.DirStateFactory$Result]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirStateFactory$Result]

    }

}

package org.j8unit.repository.javax.naming.spi;

import javax.naming.directory.Attributes;
import javax.naming.spi.DirStateFactory;
import javax.naming.spi.DirStateFactory.Result;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirStateFactoryClassTest
implements org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests<DirStateFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirStateFactory]

    @Override
    public Class<DirStateFactory> createNewSUT() {
        return DirStateFactory.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirStateFactory]

    @RunWith(J8Unit4.class)
    public static class ResultClassTest
    implements org.j8unit.repository.javax.naming.spi.DirStateFactoryClassTests.ResultClassTests<Result> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.spi.DirStateFactory$Result]

        @Override
        public Class<Result> createNewSUT() {
            return Result.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link Result#Result(Object, Attributes) public
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
            final Result sut = null; // = new Result(Object, Attributes);
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.spi.DirStateFactory$Result]

    }

}

package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.PSource;
import javax.crypto.spec.PSource.PSpecified;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PSource} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.crypto.spec.PSourceClassTests}).
 */
@RunWith(J8Unit4.class)
public class PSourceClassTest
implements PSourceClassTests<PSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.PSource]

    @Override
    public Class<PSource> createNewSUT() {
        return PSource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.PSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.PSource]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link PSpecified} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.crypto.spec.PSourceClassTests.PSpecifiedClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class PSpecifiedClassTest
    implements PSpecifiedClassTests<PSpecified> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.crypto.spec.PSource$PSpecified]

        @Override
        public Class<PSpecified> createNewSUT() {
            return PSpecified.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.crypto.spec.PSource.PSpecified#PSpecified(byte[]) public
         * javax.crypto.spec.PSource$PSpecified(byte[])}.
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
        public void create_PSpecified_byteArray()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final PSpecified sut = null; // = new PSpecified(byte[]);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.crypto.spec.PSource$PSpecified]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.crypto.spec.PSource$PSpecified]

    }

}

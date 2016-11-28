package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardTerminals;
import javax.smartcardio.CardTerminals.State;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CardTerminals} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests}).
 */
@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class CardTerminalsClassTest
implements CardTerminalsClassTests<CardTerminals> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardTerminals]

    @Override
    public Class<CardTerminals> createNewSUT() {
        return CardTerminals.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardTerminals]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardTerminals]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link State} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.smartcardio.CardTerminalsClassTests.StateClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class StateClassTest
    implements StateClassTests<State> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.CardTerminals$State]

        @Override
        public Class<State> createNewSUT() {
            return State.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.smartcardio.CardTerminals.State#values()
         * public static javax.smartcardio.CardTerminals$State[] javax.smartcardio.CardTerminals$State.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link javax.smartcardio.CardTerminals.State#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.smartcardio.CardTerminals.State#valueOf(String) public static
         * javax.smartcardio.CardTerminals$State javax.smartcardio.CardTerminals$State.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link javax.smartcardio.CardTerminals.State#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.CardTerminals$State]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.CardTerminals$State]

    }

}

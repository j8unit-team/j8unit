package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelector.Purpose;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link KeySelector} (by simply reusing the
 * J8Unit test interface {@link KeySelectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class KeySelectorClassTest
implements KeySelectorClassTests<KeySelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.KeySelector]

    @Override
    public Class<KeySelector> createNewSUT() {
        return KeySelector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.KeySelector#singletonKeySelector(java.security.Key) public static
     * javax.xml.crypto.KeySelector javax.xml.crypto.KeySelector.singletonKeySelector(java.security.Key)}.
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
    public void test_singletonKeySelector_Key()
    throws Exception {
        // write some test for {@link javax.xml.crypto.KeySelector#singletonKeySelector(java.security.Key)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.KeySelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.KeySelector]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Purpose} (by simply reusing the
     * J8Unit test interface {@link PurposeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class PurposeClassTest
    implements PurposeClassTests<Purpose> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.KeySelector$Purpose]

        @Override
        public Class<Purpose> createNewSUT() {
            return Purpose.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.KeySelector$Purpose]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.KeySelector$Purpose]

    }

}

package org.j8unit.repository.javax.xml.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelector.Purpose;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link KeySelector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.KeySelectorTests}).
 */

@RunWith(J8Unit4.class)
public class KeySelectorTest
implements KeySelectorTests<KeySelector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector]

    @Override
    public KeySelector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.KeySelector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.KeySelector]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.KeySelector]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Purpose} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.KeySelectorTests.PurposeTests}).
     */

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PurposeTest
    implements PurposeTests<Purpose> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector$Purpose]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Purpose.DECRYPT, //
                                    Purpose.SIGN, //
                                    Purpose.ENCRYPT, //
                                    Purpose.VERIFY);
        }

        @Parameter(0)
        public Purpose sut;

        @Override
        public Purpose createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.KeySelector$Purpose]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.KeySelector$Purpose]

    }

}

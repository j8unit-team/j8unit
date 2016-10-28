package org.j8unit.repository.javax.xml.crypto;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.KeySelector.Purpose;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class KeySelectorTest
implements org.j8unit.repository.javax.xml.crypto.KeySelectorTests<KeySelector> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector]

    @Override
    public KeySelector createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.KeySelector], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector]

    @RunWith(J8Unit4.class)
    public static class PurposeTest
    implements org.j8unit.repository.javax.xml.crypto.KeySelectorTests.PurposeTests<Purpose> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector$Purpose]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
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

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.KeySelector$Purpose]

    }

}

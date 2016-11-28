package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttributedCharacterIterator} (by
 * simply reusing the J8Unit test interface {@link org.j8unit.repository.java.text.AttributedCharacterIteratorTests}).
 */
@RunWith(J8Unit4.class)
public class AttributedCharacterIteratorTest
implements AttributedCharacterIteratorTests<AttributedCharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator]

    @Override
    public AttributedCharacterIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.AttributedCharacterIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.AttributedCharacterIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.AttributedCharacterIterator]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Attribute} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests}).
     */
    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class AttributeTest
    implements AttributeTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator$Attribute]

        @Parameters(name = "{index}: {0}")
        public static Iterable<? extends Object> sutData() {
            return testParametersOf(Attribute.LANGUAGE, //
                                    Attribute.INPUT_METHOD_SEGMENT, //
                                    Attribute.READING);
        }

        @Parameter(0)
        public Attribute sut;

        @Override
        public Attribute createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.AttributedCharacterIterator$Attribute]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.AttributedCharacterIterator$Attribute]

    }

}

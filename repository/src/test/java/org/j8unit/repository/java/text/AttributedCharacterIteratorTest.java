package org.j8unit.repository.java.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class AttributedCharacterIteratorTest
implements org.j8unit.repository.java.text.AttributedCharacterIteratorTests<AttributedCharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator]

    @Override
    public AttributedCharacterIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.AttributedCharacterIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator]

    @RunWith(J8Unit4.class)
    public static class AttributeTest
    implements org.j8unit.repository.java.text.AttributedCharacterIteratorTests.AttributeTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator$Attribute]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
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

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedCharacterIterator$Attribute]

    }

}

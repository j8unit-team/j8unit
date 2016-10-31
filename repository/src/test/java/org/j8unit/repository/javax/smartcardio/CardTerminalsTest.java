package org.j8unit.repository.javax.smartcardio;

import static org.j8unit.util.TestParametersUtil.testParametersOfEnumClass;
import javax.smartcardio.CardTerminals;
import javax.smartcardio.CardTerminals.State;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class CardTerminalsTest
implements org.j8unit.repository.javax.smartcardio.CardTerminalsTests<CardTerminals> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardTerminals]

    @Override
    public CardTerminals createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.smartcardio.CardTerminals], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CardTerminals]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CardTerminals]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class StateTest
    implements org.j8unit.repository.javax.smartcardio.CardTerminalsTests.StateTests<State> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardTerminals$State]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOfEnumClass(State.class);
        }

        @Parameter(0)
        public State sut;

        @Override
        public State createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CardTerminals$State]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CardTerminals$State]

    }

}

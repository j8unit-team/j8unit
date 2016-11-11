package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Unmarshaller} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.UnmarshallerTests}).
 */

@RunWith(J8Unit4.class)
public class UnmarshallerTest
implements UnmarshallerTests<Unmarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller]

    @Override
    public Unmarshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Unmarshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Unmarshaller]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Unmarshaller]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Listener} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.UnmarshallerTests.ListenerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListenerTest
    implements ListenerTests<Listener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller$Listener]

        @Override
        public Listener createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Unmarshaller.Listener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Unmarshaller$Listener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Unmarshaller$Listener]

    }

}

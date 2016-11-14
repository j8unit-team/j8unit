package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Marshaller;
import javax.xml.bind.Marshaller.Listener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Marshaller} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.MarshallerTests}).
 */

@RunWith(J8Unit4.class)
public class MarshallerTest
implements MarshallerTests<Marshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Marshaller]

    @Override
    public Marshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Marshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Marshaller]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Marshaller]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Listener} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.MarshallerTests.ListenerTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListenerTest
    implements org.j8unit.repository.javax.xml.bind.MarshallerTests.ListenerTests<Listener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Marshaller$Listener]

        @Override
        public Listener createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Marshaller.Listener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.Marshaller$Listener]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.Marshaller$Listener]

    }

}

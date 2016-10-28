package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshallerTest
implements org.j8unit.repository.javax.xml.bind.UnmarshallerTests<Unmarshaller> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller]

    @Override
    public Unmarshaller createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Unmarshaller], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller]

    @RunWith(J8Unit4.class)
    public static class ListenerTest
    implements org.j8unit.repository.javax.xml.bind.UnmarshallerTests.ListenerTests<Listener> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller$Listener]

        @Override
        public Listener createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.Unmarshaller.Listener], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.Unmarshaller$Listener]

    }

}

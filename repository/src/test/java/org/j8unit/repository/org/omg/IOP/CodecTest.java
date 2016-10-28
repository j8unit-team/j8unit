package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.Codec;

@RunWith(J8Unit4.class)
public class CodecTest
implements org.j8unit.repository.org.omg.IOP.CodecTests<Codec> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.Codec]

    @Override
    public Codec createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.Codec], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.Codec]

}

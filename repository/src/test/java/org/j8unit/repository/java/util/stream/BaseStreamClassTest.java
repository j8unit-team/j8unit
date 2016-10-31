package org.j8unit.repository.java.util.stream;

import java.util.stream.BaseStream;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class BaseStreamClassTest
implements org.j8unit.repository.java.util.stream.BaseStreamClassTests<BaseStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.stream.BaseStream]

    @Override
    public Class<BaseStream> createNewSUT() {
        return BaseStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.stream.BaseStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.stream.BaseStream]

}

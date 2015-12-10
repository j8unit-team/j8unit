package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HexBinaryAdapterTest
implements org.j8unit.repository.javax.xml.bind.annotation.adapters.HexBinaryAdapterTests<javax.xml.bind.annotation.adapters.HexBinaryAdapter> {

    @Override
    public javax.xml.bind.annotation.adapters.HexBinaryAdapter createNewSUT() {
        return new javax.xml.bind.annotation.adapters.HexBinaryAdapter();
    }

}

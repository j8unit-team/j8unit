package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameDynAnyPairClassTest
implements org.j8unit.repository.org.omg.DynamicAny.NameDynAnyPairClassTests<org.omg.DynamicAny.NameDynAnyPair> {

    @Override
    public Class<org.omg.DynamicAny.NameDynAnyPair> createNewSUT() {
        return org.omg.DynamicAny.NameDynAnyPair.class;
    }

}

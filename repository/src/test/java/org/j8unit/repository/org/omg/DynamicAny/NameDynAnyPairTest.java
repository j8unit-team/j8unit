package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameDynAnyPairTest
implements org.j8unit.repository.org.omg.DynamicAny.NameDynAnyPairTests<org.omg.DynamicAny.NameDynAnyPair> {

    @Override
    public org.omg.DynamicAny.NameDynAnyPair createNewSUT() {
        return new org.omg.DynamicAny.NameDynAnyPair();
    }

}

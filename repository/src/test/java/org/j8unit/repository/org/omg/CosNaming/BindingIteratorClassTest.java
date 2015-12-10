package org.j8unit.repository.org.omg.CosNaming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingIteratorClassTest
implements org.j8unit.repository.org.omg.CosNaming.BindingIteratorClassTests<org.omg.CosNaming.BindingIterator> {

    @Override
    public Class<org.omg.CosNaming.BindingIterator> createNewSUT() {
        return org.omg.CosNaming.BindingIterator.class;
    }

}

package org.j8unit.showcase.jm;

import java.util.ArrayList;
import java.util.List;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class Test2
implements ITest2 {

    @Override
    public List<String> createNewSUT() {
        return new ArrayList<>();
    }

}

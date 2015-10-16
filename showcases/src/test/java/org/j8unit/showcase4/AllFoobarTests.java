package org.j8unit.showcase4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ org.j8unit.showcase1a.FoobarTest.class, org.j8unit.showcase1b.FoobarTest.class, org.j8unit.showcase1c.FoobarTest.class,
               org.j8unit.showcase2a.FoobarTest.class, org.j8unit.showcase2b.FoobarTest.class, org.j8unit.showcase2c.FoobarTest.class,
               org.j8unit.showcase3a.FoobarTest.class, org.j8unit.showcase3b.FoobarTest.class, org.j8unit.showcase3c.FoobarTest.class })
public class AllFoobarTests {

}

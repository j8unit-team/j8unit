# [](#j8unit-and-the-j8unit-repository)J8Unit And The J8Unit Repository

J8Unit combines the power of JUnit4 and Java 8.
Shortly spoken, it comes along with:

* some **fancy assert** methods
  that can take _[CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)_ or
  _[Supplier<? extends CharSequence>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)_ as
  its _[AssertionError](https://docs.oracle.com/javase/8/docs/api/java/lang/AssertionError.html)_ message,
* a **extended TestClass model**
  that (in addition to the JUnit4 model) detects test methods which are specified as _default_ _interface_ methods,
* a Java-8-based **reusable Tests API**
  that allow programmer to verify its implementations against some accomplishing behaviour expectations,
* few **additional test runners**
  that (in addition to the JUnit4 runners) execute test methods which are specified as _default_ _interface_ methods,
* a **repository of reusable tests** (called the J8Unit Repository)
  that contains an instantly growing number of reusable tests.

You can read a brief 2-minute description right here in the below sections.
You can read a condensed 5-minute description in the [J8Unit in a nutshell](J8UnitInANutshell.md).


The next sections give a brief summary of these features. Each feature's extended description is given on a separate
page.

## [](#java-8-based-testclass-model)Java-8-Based TestClass Model

One of the new features of Java 8 is the _default_ implementation of _interface_ methods. Obviously, such methods can
be tests too; However, JUnit4 does not detect these methods.
Fortunately, the [JUnit4 TestClass model](http://junit.org/junit4/javadoc/4.12/org/junit/runners/model/TestClass.html)
only needs a slightly modification to do so.

The [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java)
provides this indispensable extension just by additionally scanning for all _[@Test](http://junit.org/junit4/javadoc/4.12/org/junit/Test.html)_
annotated _default_ methods -- unless overridden by a more specific method within the given test class or any of its
super classes.

In result, J8Unit allows you to group tests within certain interfaces.

```java
package org.junit8.examples;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public interface ReusableTests {

  @Test
  public void foo() {
    /* arrange */
    // [...]
    /* act */
    // [...]
    /* assert */
    assertTrue(...);
  }

}
```

```java
package org.junit8.examples;

import org.junit.runner.RunWith;
import org.j8unit.runners.J8Unit4;

@RunWith(J8Unit4.class)
public class MyTests implements ReusableTests, SomeOtherTests, FurtherTests {

  // additional tests

}
```

**Even more, tests can be easily reused independently of a specific test class hierarchy.**

## [](#the-reusable-tests-api)The Reusable Tests API

Admittedly, reusing tests does not make sense if the behaviour is absolutely the same each time it is invoked. Doing so is nothing else than a multiple execution of the same test. 



## [](#the-j8unit-test-runners)The J8Unit Test Runners

Unfortunately, JUnit4 does not provide injection of the test class model to used; Thus, when running J8Unit tests you have to specify an according test runner
that is aware of the extended [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java).

J8Unit provides such runners for each common use case:

* for single test classes (**J8BlockJUnit4ClassRunner**, **J8Unit4**),
* for parameterised tests (**J8Parameterized**)
* for Spring projects (**J8SpringJUnit4ClassRunner**, **J8SpringJUnit4**).
* for an _automatic invocation of all suitable j8unit tests_ that are provided by the J8Unit Repository and similar repositories (**APIConformance**).  

simply scans for all
_[@Test](http://junit.org/junit4/javadoc/4.12/org/junit/Test.html)_ annotated _default_ methods of each (either directly or indirectly) implemented interface of
the given test class.

In order to allow JUnit4 to detect _[@Test](http://junit.org/junit4/javadoc/4.12/org/junit/Test.html)_ of 

this package contains the indispensable extension of {@link org.junit.runners.model.TestClass} in order to
 * support awareness of {@code default} methods. Unfortunately, JUnit4 does not provide injection of the class model to
 * be used; Thus, you have to specify an according test runner when running J8Unit tests.



In addition to the [JUnit4 TestClass model](http://junit.org/junit4/javadoc/4.12/org/junit/runners/model/TestClass.html), J8Unit is able to detect 
test methods which are specified as _default_ _interface_ methods:

The [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java) simply scans for all
_[@Test](http://junit.org/junit4/javadoc/4.12/org/junit/Test.html)_ annotated _default_ methods of each (either directly or indirectly) implemented interface of
the given test class.

In result, tests can be grouped within certain interfaces.
**Even more, tests can be easily reused independently of a specific test class hierarchy.**

If you are interested in details, read [the explanation at full length](J8TestClass).

## [](#the-j8unit-test-runners)The J8Unit Test Runners

Any runner that uses the [J8Unit TestClass model](#java-8-based-testclass-model) is able to execute these tests too.
Unfortuantely, 

In result, any [test runner](#J8UnitTestRunners) that uses the J8Unit TestClass model is able to execute these tests too.

### [](#j8blockjunit4classrunner--j8unit4)J8BlockJUnit4ClassRunner & J8Unit4

### [](#j8parameterized)J8Parameterized

### [](#apiconformance)APIConformance


... thus, they allow allow reusage of test methods independently of your test class hierarchy.

## [](#the-j8unit-repository)The J8Unit Repository

Because of the [Java-8-enabled TestClass model](#J8UnitTestClassModel), J8Unit provides a very smart way to reuse tests 

Currently, we work hard on a j8unit test interface repository.
Once it is finished, we want to provide reusable test for any accessible method of any class, enum, interface, or annotation of JDK 8.

Until now, any SDK 8 type has an according dummy j8unit test interface.
The first repository release is coming soon and will provide few basic test methods.

After the first repository release, we want to invite others to help us increasing the test coverage by providing implementations of the dummy test methods.

*If you are interested in helping, come back in January 2016. We will provide any required information to get your code into j8unit repository.*

## [](#additional-assert-methods)Additional Assert Methods

### (a.k.a. On-Demand Failure Messages)
 
If you ever wanted to use [CharSequence](docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html) messages when 
After all is said and done you fell asleep as you are too tired to work further.
And then you get up the next morning

# [](#roadmap)Roadmap

See the [open issues](https://github.com/j8unit-team/j8unit/issues) for a list of proposed features (and known issues).

# J8Unit And The J8Unit Repository

J8Unit combines the power of JUnit4 and Java 8.
Briefly spoken, it comes along with:

* some **fancy assert** methods
  that can take _[CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)_ or
  _[Supplier<? extends CharSequence>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)_ as
  its _[AssertionError](https://docs.oracle.com/javase/8/docs/api/java/lang/AssertionError.html)_ message,
* an **extended TestClass model**
  that (in addition to the JUnit4 model) detects test methods which are specified as
  [`default` `interface`](https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.4) methods,
* a Java-8-based **reusable Tests API**
  that (a) allows API developer to publish their API with accompanying tests
  and (b) allows programmer to verify its custom implementations against these behaviour expectations,
* few **additional test runners**
  that (in addition to the JUnit4 runners) execute test methods which are specified as `default` `interface` methods,
* a **repository of reusable tests** (called the J8Unit Repository)
  that contains an instantly growing number of reusable tests that relate to all Java types of Java 8. 

You can read a brief 5-minute description right here in the below sections.

Spiced with few more information, you can read a condensed 15-minute description in [J8Unit in a Nutshell](README/J8UnitInANutshell.md).
Depending on whether you are using an existing API or you are programming a new API, you should focus on the according chapter.

If you are interested in details, you should dive into [the comprehensive descriptions](README/J8UnitHandbook.md) or just read the
[J8Unit cover story of the Java Magazin 2.16](https://jaxenter.de/testen-ohne-neu-zu-bauen-java-8-features-in-junit-tests-36101).

## Table Of Contents

1. _J8Unit And The J8Unit Repository_
    1. [Java-8-Based TestClass Model](#java-8-based-testclass-model)
    2. [The Reusable Tests API](#the-reusable-tests-api)
    3. [The J8Unit Repository](#the-j8unit-repository)
    4. [The J8Unit Test Runners](#the-j8unit-test-runners)
    5. [Additional Assert Methods](#additional-assert-methods)

## Java-8-Based TestClass Model

One of the new features of Java 8 is the [`default` implementation of `interface` methods](https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.4).
Obviously, such methods can be tests too; However, JUnit4 does not detect these methods.
Fortunately, the [JUnit4 TestClass model](http://junit.org/junit4/javadoc/latest/org/junit/runners/model/TestClass.html)
only needs a slightly modification to do so.

The [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java)
provides this indispensable extension just by additionally scanning for all _[@Test](http://junit.org/junit4/javadoc/latest/org/junit/Test.html)_
annotated `default` methods. Unless overridden by a more specific method within the given test class or any of its
super classes, these tests will be executed too.

In result, J8Unit allows you to group tests within certain interfaces.
**Even more, tests can be easily reused independently of a specific test class hierarchy.**

## The Reusable Tests API

Admittedly, reusing tests does not make sense if the behaviour is absolutely the same each time it is invoked.
Doing so would be nothing else than a multiple execution of the same test.

Hence, [J8Unit tests](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/J8UnitTest.java) _usually_ base on a specific
type-under-test and, within each test execution, use an instance of it.

**If you are using an existing API** (by extending some API classes or implementing sone API interfaces), you should only provide instances of your
type-under-test and **reuse the accompanying J8Unit-based tests** of that API.
**If you are programming a new API**, you should also **provide such reusable J8Unit-based tests** in order to allow others to verify the conformance
of their implementations against your behaviour expectations.

## The J8Unit Repository

As a matter of course, every custom Java type must conform to the related Java API and every implementation of a Java `interface` must
conform to the `interface`'s requirements, usually "specified" as JavaDoc.
In general, every overridden method must [conform to the requirements of the super type](https://en.wikipedia.org/wiki/Liskov_substitution_principle).

In addition, even the `class`es itself must conform to various expectations.

For example, all sub-types of [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) should provide a zero-argument
and a [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)-argument constructor.
Obviously, this is a `class`-specific behaviour.
In general, all constraints referring to the provision of specific constructors (and its individual requirements) should be covered by according test methods.
(Note, this is not limited to constructors only -- Just think of factory methods and further.)

For another example,
[by virtue of the _AnnotationTypeElementDeclaration_ production, a method declaration in an annotation type declaration cannot have formal parameters, type parameters, or a _throws_ clause (JLS, Sec. 9.6.1)](https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1).
Apparently, this is a type-specific behaviour too; And it must be tested!

Since Java does not provide a J8Unit-based collection of reusable tests, the _J8Unit Repository_ has been created.
Currently, it contains more than 8.100 reusable J8Unit skeleton tests classes and few real test methods. 
In order to make use of these tests, you need to add the J8Unit Repository to your test scope:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>repository</artifactId>
  <version>1.0.0</version>
  <scope>test</scope>
</dependency>
```

## The J8Unit Test Runners

Unfortunately, JUnit4 does not provide injection of the test class model to be used; Thus, when running J8Unit tests you have to specify an according test runner
that is aware of the extended [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java).

J8Unit provides such runners for each common use case:

* for single test classes (**J8BlockJUnit4ClassRunner**, **J8Unit4**),
* for parameterised tests (**J8Parameterized**),
* for Spring projects (**J8UnitSpringJUnit4ClassRunner**, **J8UnitSpringRunner**),
* for an _automatic invocation of all suitable J8Unit tests_ that are provided by the J8Unit Repository and similar repositories (**APIConformance**).

In order to make use of these test runners, you need to add J8Unit Core to your test scope:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>core</artifactId>
  <version>4.12.1<version>
  <scope>test</scope>
</dependency>
```

_To emphasise the last point again:_ **APIConformance** automatically invokes all suitable J8Unit tests.
We strongly recommend to consider the usage of this test runner.
Really! Give it a try ...
You will love the superduper combination with the J8Unit Repository.

## Additional Assert Methods

The current JUnit4 [Assert statements](http://junit.org/junit4/javadoc/latest/org/junit/Assert.html) are strongly coupled to
[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)-based messages.

However, you might want to provide [CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)-based messages.
Or even further, you might want to use the Java 8's [Supplier](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html) to provide on-demand messages.
(Such intention is similar to [this](https://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log-java.util.logging.Level-java.util.function.Supplier-)
or [this](https://logging.apache.org/log4j/2.x/log4j-api/apidocs/org/apache/logging/log4j/Logger.html#debug%28org.apache.logging.log4j.util.Supplier%29).)

The [J8Unit Assert](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/Assert.java)
provides these additional assert methods.
Similar to the J8Unit runners, you need to add J8Unit Core to your test scope and you can use it:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>core</artifactId>
  <version>4.12.1<version>
  <scope>test</scope>
</dependency>
```

# Roadmap

See the [open issues](https://github.com/j8unit-team/j8unit/issues) for a list of proposed features (and known issues).

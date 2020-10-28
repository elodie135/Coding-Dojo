package fr.elodie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

  /**
   * Rigorous Test.
   */
  @Test
  void fooBarQix() {
    assertEquals("FooFoo", App.fooBarQix(3));
    assertEquals("BarBar", App.fooBarQix(5));
    assertEquals("Foo", App.fooBarQix(6));
    assertEquals("QixQix", App.fooBarQix(7));
    assertEquals("4", App.fooBarQix(4));
    assertEquals("FooBarBar", App.fooBarQix(15));
    assertEquals("FooQix", App.fooBarQix(21));
    assertEquals("FooFooFoo", App.fooBarQix(33));
    assertEquals("BarFoo", App.fooBarQix(53));
    assertEquals("FooBarQix*Bar", App.fooBarQix(105));
    assertEquals("FooQix**", App.fooBarQix(10101));
  }
}

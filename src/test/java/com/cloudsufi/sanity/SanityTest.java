package com.cloudsufi.sanity;

import org.junit.Assert;
import org.junit.Test;

public class SanityTest {

  @Test
  public void testIsTrue() {
    Assert.assertTrue(Sanity.isTrue());
  }

  @Test
  public void testIsFalse() {
    Assert.assertFalse(Sanity.isFalse());
  }

}
/*
 * Copyright © 2022 Mark Raynsford <code@io7m.com> https://www.io7m.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR
 * IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */


package com.io7m.mutable.numbers.tests.core;

import com.io7m.mutable.numbers.core.MutableCharacter;
import com.io7m.mutable.numbers.core.MutableDouble;
import com.io7m.mutable.numbers.core.MutableFloat;
import com.io7m.mutable.numbers.core.MutableInteger;
import com.io7m.mutable.numbers.core.MutableLong;
import com.io7m.mutable.numbers.core.MutableShort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GeneratedClassesTest
{
  @Test
  public void testCharacter()
  {
    assertEquals(
      'a',
      MutableCharacter.create()
        .setValue('a')
        .value()
    );
  }

  @Test
  public void testInteger()
  {
    assertEquals(
      23,
      MutableInteger.create()
        .setValue(23)
        .value()
    );
  }

  @Test
  public void testShort()
  {
    assertEquals(
      23,
      MutableShort.create()
        .setValue((short) 23)
        .value()
    );
  }

  @Test
  public void testLong()
  {
    assertEquals(
      23L,
      MutableLong.create()
        .setValue(23L)
        .value()
    );
  }

  @Test
  public void testDouble()
  {
    assertEquals(
      23.0,
      MutableDouble.create()
        .setValue(23.0)
        .value()
    );
  }

  @Test
  public void testFloat()
  {
    assertEquals(
      23.0f,
      MutableFloat.create()
        .setValue(23.0f)
        .value()
    );
  }
}

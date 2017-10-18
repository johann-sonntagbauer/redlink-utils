/*
 * Copyright 2017 redlink GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.redlink.utils;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RandomUtilsTest {

    @Test
    public void nextString() throws Exception {
        for (int i = 0; i < 50; i++) {
            assertEquals(i, RandomUtils.nextString(i).length());
        }
    }

    @Test
    public void nextStringRnd() throws Exception {
        Random rnd = new Random(42);
        assertEquals("6FyS", RandomUtils.nextString(rnd, 4));
        assertEquals("2X3wn3y0", RandomUtils.nextString(rnd, 8));
        assertEquals("cWWOeQNjeDWN", RandomUtils.nextString(rnd, 12));
        assertEquals("TN6iPQSqmhdR4Ppo", RandomUtils.nextString(rnd, 16));
        assertEquals("RjpBpcptlzNu6wyGvRfJZR", RandomUtils.nextString(rnd, 22));

        for (int i = 0; i < 50; i++) {
            assertEquals(i, RandomUtils.nextString(rnd, i).length());
        }
    }

}
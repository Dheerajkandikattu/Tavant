package com.org.tav.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
class ColorBagTest {
 
    private ColorBag colorBag;
 
    @BeforeEach //denotes that the annotated method should be executed before each @Test @RepeatedTest @ParamitrizedTest
    void setupEach() {
 
        colorBag = new ColorBag();
        colorBag.add("red");
        colorBag.add("green");
        colorBag.add("yellow");
        colorBag.add("blue");
        colorBag.add("magenta");
        colorBag.add("brown");
    }
 
    @Test
    @DisplayName("added color value should be in bag")
    void add() {
 
        var newColor = "pink";
        colorBag.add(newColor);
 
        assertTrue(colorBag.contains(newColor),
                "failure - added colour not it the bag");
    }
 
    @Test
    @DisplayName("removed color should not be in bag")
    void remove() {
 
        var color = "green";
        colorBag.remove(color);
 
        assertFalse(colorBag.contains(color),
                "failure - removed color still in bag");
    }
    @Test
    @DisplayName("color bag should be transformed into List")
    void toList() {
 
        var myList = Arrays.asList("red","green", "yellow",
                "blue", "magenta", "brown");
        var colorList = colorBag.toList();
 
        Collections.sort( myList);
        Collections.sort(colorList);
 
        assertEquals(colorList, myList,
                "failure - color bag not transformed into List");
    }
 
    @Test
    @DisplayName("size of a color bag should match")
    void size() {
 
        int bagSize = colorBag.size();
System.out.println("Size of the bag = "+bagSize);
        assertEquals(6, bagSize,
                "failure - size of bag does not match");
    }
 
}
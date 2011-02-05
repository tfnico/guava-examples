package com.tfnico.examples.guava;

import static com.google.common.collect.Collections2.filter;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.collect.ImmutableList;


public class NewStuffInR08Test {

	@Test
	public void ascii(){
		System.out.print("Carriage return:");
		System.out.print(new String(new byte[] {Ascii.CR} ));
		System.out.print("Second line!");
	}
	
	@Test
	public void charMatcherAnyOf() {
		CharMatcher vowelMatcher = CharMatcher.anyOf("aeiouy");
		assertTrue(vowelMatcher.matches('a'));
		
		ImmutableList<Character> someLetters = ImmutableList.of('a','b','c','d','e');
		Collection<Character> filtered = filter(someLetters, vowelMatcher);
		
		Collection<Character> of = ImmutableList.of('a','e');
		assertThat(filtered, is(of));
		
	}
	
}

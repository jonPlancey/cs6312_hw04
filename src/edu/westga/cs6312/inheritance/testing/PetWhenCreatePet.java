package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.Pet;


/**
 * Homework 04 Unit Tests
 * @author 	cs6312
 * @author 	jim perry, jr.
 * @version	01.30.2016
 */
public class PetWhenCreatePet {

	/**
	 * Test, verify Pet object is correctly created
	 */		
	@Test
	public void testPetWhenCreatePetRalphWoof() {
		Pet dog = new Pet("Harris", "boo");		
		String expect = "A pet named Harris that makes the sound boo";
		String result = dog.toString();		
		assertEquals(expect, result);	
	}

}

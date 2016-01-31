package edu.westga.cs6312.inheritance.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.westga.cs6312.inheritance.model.Pet;


public class PetWhenCreatePet {

	/**
	 * Test, verify Pet object is correctly created
	 */		
	@Test
	public void testPetWhenCreatePetRalphWoof() {
		Pet dog = new Pet("Harris", "boo");
		String expect = "A pet named Ralph that makes the sound woof";
		String result = dog.toString();
		assertEquals(expect, result);	
	}

}

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
public class PetWhenGetName {

	/**
	 * Test, make sure getPet name retuns
	 * the correct name of created prt
	 */		
	@Test
	public void testPetWhenGetNameHarris() {
		Pet dog = new Pet("Harris", "boo");		
		String expect = "Harris";
		String result = dog.getPetName();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPet name retuns
	 * the correct name of created prt
	 */		
	@Test
	public void testPetWhenGetNameNala() {
		Pet pet = new Pet("Nala", "roar");		
		String expect = "Nala";
		String result = pet.getPetName();		
		assertEquals(expect, result);		
	}
	

	/**
	 * Test, make sure getPet name retuns
	 * the correct name of created prt
	 */		
	@Test
	public void testPetWhenGetNameViolet() {
		Pet pet = new Pet("Violet", "arf");		
		String expect = "Violet";
		String result = pet.getPetName();		
		assertEquals(expect, result);	
	}
	

	/**
	 * Test, make sure getPet name retuns
	 * the correct name of created prt
	 */		
	@Test
	public void testPetWhenGetNameBolt() {
		Pet pet = new Pet("Bolt", "owloo");		
		String expect = "Bolt";
		String result = pet.getPetName();		
		assertEquals(expect, result);	
	}	
	

}

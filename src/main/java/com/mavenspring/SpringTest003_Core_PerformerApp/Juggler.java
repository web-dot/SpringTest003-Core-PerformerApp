package com.mavenspring.SpringTest003_Core_PerformerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performer {

	private int numRings=3;

	public Juggler() {
		super();
		System.out.println("in Juggler no-arg public constructor");
	}
	
	public Juggler(int numRings) {
		super();
		this.numRings = numRings;
		System.out.println("in Juggler param constructor numRings = "+ this.numRings);
	}

	public int getNumRings() {
		return numRings;
	}
	
	public void setNumRings(int numRings) {
		this.numRings = numRings;
		System.out.println("in Juggler-> setNumRings() numRings =" + this.numRings);
	}

	public void perform() {
		
		System.out.println("I am a juggler juggling " + this.numRings + " rings");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numRings;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juggler other = (Juggler) obj;
		if (numRings != other.numRings)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Juggler [numRings=" + numRings + "]";
	}
	
	

}

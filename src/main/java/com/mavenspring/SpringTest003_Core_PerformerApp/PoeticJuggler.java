package com.mavenspring.SpringTest003_Core_PerformerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PoeticJuggler extends Juggler {
	
	@Autowired
	private Poem poem;

	public PoeticJuggler() {
		super();
	}

	public PoeticJuggler(int numRings) {
		super(numRings);
	}
	
	public Poem getPoem() {
		return poem;
	}

	public void setPoem(Poem poem) {
		this.poem = poem;
	}
	
	@Autowired
	public void Perform() {
		super.perform();
		System.out.println("while reciting...");
		poem.recite();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((poem == null) ? 0 : poem.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "PoeticJuggler [poem=" + poem + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoeticJuggler other = (PoeticJuggler) obj;
		if (poem == null) {
			if (other.poem != null)
				return false;
		} else if (!poem.equals(other.poem))
			return false;
		return true;
	}
	
}









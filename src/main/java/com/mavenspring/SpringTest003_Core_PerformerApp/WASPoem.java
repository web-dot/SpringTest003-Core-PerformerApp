package com.mavenspring.SpringTest003_Core_PerformerApp;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class WASPoem implements Poem {

	
	String[] lines = {"All the world's a stage,", 
			"And all the men and women merely players,", 
			"They have their exits and their entrances,", 
			"And one man in his time plays many parts,", 
			"His acts being seven ages."};
	
	public void recite() {
		
		for(String l : lines) {
			System.out.println(l);
		}
	}

	@Override
	public String toString() {
		return "WASPoem [lines=" + Arrays.toString(lines) + "]";
	}
	

}

package src.test.java;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestHashTable {
	
	public static void main(String[] args) {
		Hashtable<String, String> ht  = new Hashtable<String, String>();
		ht.put(null, null);
		ht.put(null, "pqr");
		ht.put(null, "abc");
		
		System.out.println(ht);
		
	}

}

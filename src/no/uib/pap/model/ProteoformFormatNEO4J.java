package no.uib.pap.model;

import static org.junit.jupiter.api.Assertions.*;

import java.net.NetworkInterface;
import java.text.ParseException;

import org.junit.jupiter.api.Test;

class ProteoformFormatNEO4J {

	@Test
	void test() throws ParseException {
		Proteoform proteoform = new Proteoform("P01308"); 
		proteoform.addPtm("00087", 53L);
		proteoform.addPtm("00798", 31L);
		proteoform.addPtm("00798", 43L);
		
		String neo4jString = proteoform.toString(ProteoformFormat.NEO4J);
		System.out.println(neo4jString);
		Proteoform proteoform2 = ProteoformFormat.NEO4J.getProteoform(neo4jString);
		System.out.println(proteoform2.toString(ProteoformFormat.NEO4J));
		
		assertEquals(proteoform, proteoform2);
	}

}

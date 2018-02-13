package no.uib.pap.model;

/**
 * Specifies the possible input types for PathwayMatcher as an enum
 */
public enum InputType {
	
    GENES, 				//TODO
    ENSEMBL,			//TODO
    UNIPROT,			//TODO
    PROTEOFORMS,			//TODO
    PEPTIDES,		//TODO
    MODIFIEDPEPTIDES,//TODO
    VCF,	//TODO
    RSIDS,	//TODO
    UNKNOWN;
	
	public Iterable<InputType> getValues() {
		return this.getValues();
	}
}
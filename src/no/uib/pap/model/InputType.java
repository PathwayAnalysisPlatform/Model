package no.uib.pap.model;

/**
 * Specifies the possible input types for PathwayMatcher as an enum
 */
public enum InputType {
	
    GENES, 				
    ENSEMBL,			
    UNIPROT,			
    PROTEOFORMS,			
    PEPTIDES,		
    MODIFIEDPEPTIDES,
    VCF,	
    SNPS,	
    UNKNOWN;
	
	public Iterable<InputType> getValues() {
		return this.getValues();
	}
}
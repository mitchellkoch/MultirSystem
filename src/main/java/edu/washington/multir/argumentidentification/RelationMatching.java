package edu.washington.multir.argumentidentification;

import java.util.List;
import java.util.Map;

import edu.stanford.nlp.util.Triple;
import edu.washington.multir.data.Argument;

/**
 * RelationMatching interface returns the triples
 * of two arguments and their shared relation.
 * @author jgilme1
 *
 */
public interface RelationMatching {
	public List<Triple<Argument,Argument,String>> matchRelations(List<Argument> arguments, Map<String,List<String>> relationMap);
}

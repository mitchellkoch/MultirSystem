package edu.washington.multir.argumentidentification;

import java.util.List;

import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.util.CoreMap;
import edu.washington.multir.data.Argument;
import edu.washington.multir.knowledgebase.KnowledgeBase;

/**
 * The burden to make sure that the Annotation scheme
 * defined in the corpus is compatible with the algorithm
 * implemented in ArgumentIdentification.
 * @author jgilme1
 *
 */
public interface ArgumentIdentification {
	
	/**
	 * 
	 * @param d
	 * @param s
	 * @return
	 */
	List<Argument> identifyArguments(Annotation d, CoreMap s);
	
	
	/**
	 * The KnowledgeBase should be set if
	 * the identifyArguments algorithm makes use of
	 * it.
	 * @param kb
	 */
	void setKB(KnowledgeBase kb);
}

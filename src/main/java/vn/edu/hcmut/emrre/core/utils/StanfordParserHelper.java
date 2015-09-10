package vn.edu.hcmut.emrre.core.utils;

import java.util.List;

import edu.stanford.nlp.util.CoreMap;
import vn.edu.hcmut.emrre.core.entity.Relation;
import vn.edu.hcmut.emrre.core.entity.Word;

public interface StanfordParserHelper {
    public List<Word> parseDataToListWord(String sentence,Relation relation);
    public CoreMap parseDataToCoreMap(String docLine,Relation relation);
    public CoreMap getSentenceContainRel(String docLine, Relation relation);
}

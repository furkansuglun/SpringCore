package _04.collection.injection.annotation;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//Class seviyesinde 
//@Component
//@services
//@repository
//@controller gibi annotationlar tan�ml�yaibliriz
//bunlar� kullanabilmek i�in context-component scan tag�ndan yararlanabiliriz.!

@Service("collectionInjectionAnnotationModelId")
public class CollectionInjectionAnnotationModel {

	//collection injection s�z konusu oldugunda @Autowired yerine @Resource annatation kullan�l�r.
	//yada spring expression language ile @value annotation � kullan�labilir
	
	//@Resource(name="annotationList")
	@Value(value="#{annotationList}")
	private List<String> myList;
	
	@Resource(name="annotationSet")
	private Set<Integer> mySet;
	
	@Resource(name="annotationMap")
	private Map<String , Object> myMap;
	
	@Resource(name="annotationProperties")
	private Properties props;
	

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public Set<Integer> getMySet() {
		return mySet;
	}

	public void setMySet(Set<Integer> mySet) {
		this.mySet = mySet;
	}

	public Map<String, Object> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, Object> myMap) {
		this.myMap = myMap;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "CollectionInjectionAnnotationModel [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap
				+ ", props=" + props + "]";
	}
	
	
	
	
	
}

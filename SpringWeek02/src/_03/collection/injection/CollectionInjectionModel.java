package _03.collection.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjectionModel {
	
	private List<String> myList;
	private Set<Integer> mySet;
	private Map<String , Object> myMap;
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
	
	
	
}

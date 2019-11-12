package beans;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean // by default Name == helloBean
public class HelloBean {
	private String vorname;
	
	private List<String> freunde = Arrays.asList("Max", "Lisa", "Anna");
	
	@PostConstruct // mit annotation PostConstruct wird nach Konstruktor aufgerufen
	public void init() {
		System.out.println("init");
	}

	public List<String> getFreunde() {
		return freunde;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}

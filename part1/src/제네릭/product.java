package 제네릭;

public class product <k,m>{
	private k kind;
	private m model;
	
	public k getkind() {return this.kind;}
	public m getModel() {return this.model;}
	public void setkind(k kind) {this.kind = kind;}
	public void setmodel(m model) {this.model = model;}
}

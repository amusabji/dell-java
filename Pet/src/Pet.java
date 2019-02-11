
public interface Pet {

	public String getName();
	public String speak();
	public default String sleep() {
		return "zzz";
	}
}

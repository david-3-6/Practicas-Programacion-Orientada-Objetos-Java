package rank;

public class Link {
	public String origin;
	public String linked;
	
	public Link(String org, String lnk) {
		origin=org;
		linked=lnk;
	}

	public String getOrigin() {
		return origin;
	}

	public String getLinked() {
		return linked;
	}
	@Override
	public boolean equals (Object o) {
		boolean ok=false;
		if(o instanceof Link) {
			Link aux=(Link)o;
			ok=aux.getLinked().equalsIgnoreCase(linked)&&aux.getOrigin().equalsIgnoreCase(origin);
		}
		return ok;
	}
	@Override
	public int hashCode() {
		return origin.toLowerCase().hashCode()+linked.toLowerCase().hashCode();
	}
	@Override
	public String toString () {
		return origin+"->"+linked;
	}
}

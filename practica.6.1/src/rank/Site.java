package rank;

import java.util.Locale;


public class Site implements Comparable<Site> {
	private String name;
	private double rank;
	
	public Site (String name) {
		this.name=name;
		rank=0;
	}

	public String getName() {
		return name;
	}

	public double getRank() {
		return rank;
	}
	public void addRank(double r) {
		rank+=r;
	}
	@Override
	public boolean equals(Object o) {
		boolean ok=false;
		if(o instanceof Site) {
			ok=name.equalsIgnoreCase(((Site)o).getName());
		}
		return ok;
	}
	@Override
	public int hashCode() {
		return name.toUpperCase().hashCode();
	}
	@Override
	public String toString() {
		return name+"("+String.format(Locale.US,"%.5f",rank )+")";
	}
	@Override
	public int compareTo(Site o) {
		return name.compareToIgnoreCase(o.getName());
	}
}

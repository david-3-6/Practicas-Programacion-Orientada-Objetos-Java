package rank;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Web {
	private static final double THRESHOLD=0;
	private static Random alea;
	private Set<Link> links;
	protected Set<Site> sites;
	
	public Web() {
		sites=new TreeSet<>();
		links=new HashSet<>();
	}
	protected void addSiteWithName(String name) {
		addSite(new Site(name));
	}
	protected void addSite(Site site) {
		sites.add(site);
	}
	public void addLink(String dataLink) {
		String[] nombres = dataLink.split("\\s*->\\s*");
		if(nombres.length!=2) {
			throw new IllegalArgumentException(dataLink+" con mal formato");
		}
		addSiteWithName(nombres[0]);
		addSiteWithName(nombres[1]);
		links.add(new Link(nombres[0],nombres[1]));
	}
	public Site getSite(String name) {
		return null;
	}
	
}

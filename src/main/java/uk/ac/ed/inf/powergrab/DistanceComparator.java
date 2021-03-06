package uk.ac.ed.inf.powergrab;
import java.util.Comparator;

/**
 * This comparator is used for sorting Stations based on their distance from a Position of origin.
 */
public class DistanceComparator implements Comparator<Station> {
	Position origin;
	
	public DistanceComparator(Position origin)
	{
		this.origin = origin;
	}
	@Override
	public int compare(Station s1, Station s2) {
		double dist1 = origin.getDist(s1.getPosition());
		double dist2 = origin.getDist(s2.getPosition());
		return Double.compare(dist1, dist2);
	}

}

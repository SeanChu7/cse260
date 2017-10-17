import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class Album {

	String name;
	ArrayList<Track> tracks;
	
	public Album(String s, ArrayList<Track> t) {
		name = s;
		tracks = t;
	}
	
	public static void main(String[] args) {
		List<Album> favs = new ArrayList<>();
		List<Album> albums = new ArrayList<>();
		ArrayList<Track> t = new ArrayList<>();
		t.add(new Track(1));
		t.add(new Track(3));
		t.add(new Track(1));
		t.add(new Track(2));
		ArrayList<Track> y = new ArrayList<>();
		y.add(new Track(5));
		y.add(new Track(6));
		y.add(new Track(1));
		y.add(new Track(2));
		albums.add(new Album("Metal", t));
		albums.add(new Album("Country", y));
		albums.stream()
		.filter(a -> a.tracks.stream()
						.anyMatch(e -> e.rating >= 4))
		.forEach(a -> favs.add(a));
		favs.stream()
		.sorted(new Comparator<Album>() {
			public int compare(Album a1, Album a2) {
				return a1.name.compareTo(a2.name);
				}
			}
		)
		.collect(Collectors.toList());
		
	}
}

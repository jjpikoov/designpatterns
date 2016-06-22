package dp.composite;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class Song extends SongComponent {

    private String name;
    private String band;

    public Song(String name, String band){
        this.name = name;
        this.band = band;
    }

    @Override
    public String getSongName() {
        return this.name;
    }

    @Override
    public String getBandName() {
        return this.band;
    }

    @Override
    public void info() {
        System.out.println(this.name + " - " + this.band);
    }
}

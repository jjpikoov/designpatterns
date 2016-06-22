package dp.composite;

/**
 * Created by jjpikoov on 6/21/16.
 */
public abstract class SongComponent {


    //song group
    public void add(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent songComponent){
        throw new UnsupportedOperationException();
    }

    public void getComponent(int index){
        throw new UnsupportedOperationException();
    }


    //song
    public String getSongName(){
        throw new UnsupportedOperationException();
    }

    public String getBandName(){
        throw new UnsupportedOperationException();
    }


    //common
    public void info(){
        throw new UnsupportedOperationException();
    }
}

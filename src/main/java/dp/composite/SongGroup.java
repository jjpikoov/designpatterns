package dp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jjpikoov on 6/21/16.
 */
public class SongGroup extends SongComponent {
    List<SongComponent> songComponents = new ArrayList<SongComponent>();

    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName,  String groupDescription){
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }



    //ACHTUNG
    @Override
    public void add(SongComponent songComponent) {
        this.songComponents.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        this.songComponents.remove(songComponent);
    }

    @Override
    public void getComponent(int index) {
        this.songComponents.get(index);
    }

    @Override
    public void info() {
        System.out.println(this.getGroupName() + " " + this.groupDescription + ":");

        Iterator<SongComponent> i = this.songComponents.iterator();

        while(i.hasNext()){
            i.next().info();
        }
    }
}

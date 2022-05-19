package gof;

import javax.sound.midi.Track;

// Singleton Design Pattern
public class FactoryManager {
    private static FactoryManager instance = null;
    private FactoryManager(){}
    public static FactoryManager getInstance(){
        if(instance == null)
            instance = new FactoryManager();
        return instance;
    }

    private int numTracks = 5;
    public void startTracks()
    {
        for(int i=0;i<numTracks;++i)
        {
            System.out.println("test");
        }
    }
    public static void main(String[] args){
        FactoryManager fm = FactoryManager.getInstance();
        fm.startTracks();
    }

}

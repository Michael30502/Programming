import processing.core.PApplet;

import java.util.ArrayList;

public class Programming extends  PApplet {

    public static void main(String[] args ) {
        PApplet.main("Programming");
    }

    ArrayList<String> wordList = new ArrayList<String>();

    Sorter sorter = new Sorter();
    FileLoader fileLoader = new FileLoader(this);
    @Override

    public void setup() {

        fileLoader.load(wordList);

        println(wordList);

        sorter.sort(wordList);

        println(wordList);

    }








}

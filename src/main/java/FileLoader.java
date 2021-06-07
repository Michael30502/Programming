import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import java.util.ArrayList;

public class FileLoader {
    PApplet p;
Table words;
    FileLoader(PApplet p){
  this.p=p;

    }
void load(ArrayList wordList){
words =p.loadTable("words.csv");

  for (TableRow row : words.rows()) {
    wordList.add(row.getString(0));


}

}

}

import java.util.ArrayList;

public class Sorter {


     void sort(ArrayList<String> wordList ){
         String temp;
         for(int i = wordList.size()-1; i>0;i--){
             if(wordList.get(i-1).length()<wordList.get(i).length()) {
                 temp = wordList.get(i - 1);
                 wordList.set(i-1,wordList.get(i));
                 wordList.set(i,temp);
                 i = wordList.size();
             }

         }



    }

}

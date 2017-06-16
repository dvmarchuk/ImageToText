package antonio.survey;

import java.util.ArrayList;

/**
 * Created by DennisMarchuk on 6/16/2017.
 */

public class UnknownLetters {
    private String letter;
    private ArrayList img;

    public UnknownLetters(String letter, ArrayList img){
        this.letter = letter;
        this.img = img;
    }

    public void setLetter(String letter){
        this.letter = letter;
    }

    public String getLetter(String letter){
        return letter;
    }

    public void setImg(ArrayList img){
        this.img = img;
    }

    public ArrayList getImg(ArrayList img){
        return img;
    }
}

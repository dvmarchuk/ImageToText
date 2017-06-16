package antonio.survey;


import java.sql.Array;


/**
 * Created by DennisMarchuk on 6/15/2017.
 */

public class Letters {
    private String letter;
    private Array[] img;

    public Letters(String letter, Array[] img){
        this.letter = letter;
        this.img = img;
    }
}


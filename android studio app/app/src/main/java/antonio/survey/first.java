package antonio.survey;

/**
 * Created by antonio on 1/3/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class first extends Fragment {

     EditText nameInput, ageInput, majorInput;





    public first(){

    }


    public void pickImage(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
     // startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first, container, false);


        Button search = (Button)rootView.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, TFRequestCodes.GALLERY);*/

                BrowsePictureActivity bpa = new BrowsePictureActivity();



            }
        });



        return rootView;
    }



    @Override
public void onActivityCreated(Bundle SavedInstanceState){
super.onActivityCreated(SavedInstanceState);












}















}
//aaa

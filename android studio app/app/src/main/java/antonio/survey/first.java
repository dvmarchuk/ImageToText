package antonio.survey;

/**
 * Created by antonio on 1/3/17.
 */


import android.content.Intent;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


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

        Button search = (Button) rootView.findViewById(R.id.search);

        Button convert = (Button) rootView.findViewById(R.id.convert);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Button clicked...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();







            }
        });





        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Button clicked...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();








            }
        });




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

package antonio.survey;

/**
 * Created by antonio on 1/3/17.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
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





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.first, container, false);

        Button template = (Button)rootView.findViewById(R.id.setTemplate);
        template.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AddTemplate.class);
                startActivity(i);
            }
        });



        Button search = (Button)rootView.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Button clicked...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();

            }
        });


        Button convert = (Button) rootView.findViewById(R.id.convert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Button clicked...", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
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

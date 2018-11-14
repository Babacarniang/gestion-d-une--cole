package sn.niang.gestionecole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TerminalL1A extends AppCompatActivity {
    // 1. define list of  item



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String listItemArray [] = { "NDEYE DIOUF" , "MARIEME SECK" , "AMADOU DIALLO" ,};
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1 , // Standard row layout provided by android
                listItemArray );

        ListView myClasslist = (ListView) findViewById(R.id.lv_MyListView);
        myClasslist.setAdapter(Adapter);

        myClasslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TerminalL1A.this, "Liste des élèves: "+listItemArray[position], Toast.LENGTH_LONG).show();
            }
        });






    }
}

package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String countries[];
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        countries = getResources().getStringArray(R.array.countries);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String country_name = adapterView.getItemAtPosition(i).toString();

                switch (country_name) {
                    case "Afghanistan":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Dari & Pashto", Toast.LENGTH_SHORT).show();
                        break;
                    case "Albania":
                        Toast.makeText(MainActivity.this, country_name + "\t Language: Albanian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Algeria":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Algerian Berber & Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Andorra":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Catalan", Toast.LENGTH_SHORT).show();
                        break;
                    case "Angola":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Portuguese", Toast.LENGTH_SHORT).show();
                        break;
                    case "Antigua and Barbuda":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Argentina":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Armenia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Armenian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Australia":
                        Toast.makeText(MainActivity.this, country_name + "\t Language: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Austria":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: German", Toast.LENGTH_SHORT).show();
                        break;
                    case "Azerbaijan":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Azerbaijani", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bahamas":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bahrain":
                        Toast.makeText(MainActivity.this, country_name + "\t Language: Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bangladesh":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Bengali", Toast.LENGTH_SHORT).show();
                        break;
                    case "Barbados":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Belarus":
                        Toast.makeText(MainActivity.this, country_name + "\t Language: Belarusian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Belgium":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Dutch, French & German", Toast.LENGTH_SHORT).show();
                        break;
                    case "Belize":
                        Toast.makeText(MainActivity.this, country_name + "\t Language: Spanish & English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Benin":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bhutan":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Dzongkha", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }
}
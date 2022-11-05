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
                    case "Bolivia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bosnia and Herzegovina":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Bosnian, Croatian & Serbian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Botswana":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Brazil":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Portuguese", Toast.LENGTH_SHORT).show();
                        break;
                    case "Brunei":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Malay", Toast.LENGTH_SHORT).show();
                        break;
                    case "Bulgaria":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Bulgarian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Burkina Faso":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Burundi":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Kirundi", Toast.LENGTH_SHORT).show();
                        break;
                    case "Cambodia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Khmer", Toast.LENGTH_SHORT).show();
                        break;
                    case "Cameroon":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Canada":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English & French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Cape Verde":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Portuguese", Toast.LENGTH_SHORT).show();
                        break;
                    case "Central African Republic":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Chad":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Chile":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "China":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Mandarin", Toast.LENGTH_SHORT).show();
                        break;
                    case "Colombia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Comoros":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Congo":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Costa Rica":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Croatia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Croatian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Cuba":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Cyprus":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Greek", Toast.LENGTH_SHORT).show();
                        break;
                    case "Czech Republic":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Czech", Toast.LENGTH_SHORT).show();
                        break;
                    case "Denmark":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Danish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Djibouti":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Dominica":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Dominican Republic":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "East Timor":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Portuguese", Toast.LENGTH_SHORT).show();
                        break;
                    case "Ecuador":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Egypt":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "El Salvador":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Equatorial Guinea":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Eritrea":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Tigrinya", Toast.LENGTH_SHORT).show();
                        break;
                    case "Estonia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Estonian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Ethiopia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Amharic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Fiji":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Finland":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Finnish", Toast.LENGTH_SHORT).show();
                        break;
                    case "France":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Gabon":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Gambia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Georgia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Georgian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Germany":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: German", Toast.LENGTH_SHORT).show();
                        break;
                    case "Ghana":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Greece":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Greek", Toast.LENGTH_SHORT).show();
                        break;
                    case "Grenada":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Guatemala":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Guinea":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Guinea-Bissau":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Portuguese", Toast.LENGTH_SHORT).show();
                        break;
                    case "Guyana":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: English", Toast.LENGTH_SHORT).show();
                        break;
                    case "Haiti":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: French", Toast.LENGTH_SHORT).show();
                        break;
                    case "Honduras":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Spanish", Toast.LENGTH_SHORT).show();
                        break;
                    case "Hungary":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Hungarian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Iceland":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Icelandic", Toast.LENGTH_SHORT).show();
                        break;
                    case "India":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Hindi", Toast.LENGTH_SHORT).show();
                        break;
                    case "Indonesia":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Indonesian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Iran":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Persian", Toast.LENGTH_SHORT).show();
                        break;
                    case "Iraq":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Arabic", Toast.LENGTH_SHORT).show();
                        break;
                    case "Ireland":
                        Toast.makeText(MainActivity.this, country_name + "\tLanguage: Irish", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
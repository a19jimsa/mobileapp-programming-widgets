
# Rapport

**Assignment 3**

Uppgiften gick ut på att göra en app med ett antal olika komponenter med olika layouter. Appen har två olika layouter, en constraint layout och en linear layout. Appen använder constraint layout för att organinsera en imageview och en linear layout. På så sätt hamnar alla komponenter inuti linear layout under varandra på ett snyggt och smidigt sätt. Här används centrering och marginaler på underliggande komponenter inuti den linjära layouten.

Det finns en lista med olika berg som är en listview som lagrar flera textview inuti. Därför skapas en arrayadapter som lagrar alla textview element.

```
        mountains.add(new Mountain("Matterhorn"));
        mountains.add(new Mountain("Mont Blanc"));
        mountains.add(new Mountain("Denali"));
        final ArrayAdapter<Mountain> adapter = new ArrayAdapter<Mountain>(this, R.layout.list_item_textview,
                R.id.list_item_textView,mountains);
        final ListView my_listView = (ListView) findViewById(R.id.my_listView);
        my_listView.setAdapter(adapter);
        my_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Bla bla", Toast.LENGTH_SHORT).show();
            }
        });
```
Här skapas en arraylist som lagrar berg som sedan läggs i en ArrayAdapter med en layout från xml som heter list_item_textview. Sedan sätts adaptern till listvyn(my_listView).

I appen används tre olika vyer. En knapp, en edittext och en imagelayout. 

Varje berg skrivs ut i en lista där varje rad representeras av en textview. 

```
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/list_item_textView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:padding="10dp"
    android:textSize="24sp"></TextView>
```
För att lägga till ett berg så kan man fylla i editText och trycka på knappen.

```
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Hej","Du har tryck på knappen!");
                if(editText.getText().length() != 0){
                    mountains.add(new Mountain(editText.getText().toString()));
                    adapter.notifyDataSetChanged();
                    editText.getText().clear();
                    Toast.makeText(getApplicationContext(), "Added new Mountain", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Field can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

```


## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Alla widgets läggs till en linearLayout som i sin tur är nästlad i en constraintLayout. Sedan positioneras de i mitten och har ett mellanrum mellan varandra.

Tex:
```
<LinearLayout
        android:id="@+id/linearLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="20dp"
        android:gravity="center"
        android:orientation="vertical"
        android:padding="10dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <TextView
        ...
        ```
 

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.

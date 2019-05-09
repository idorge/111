package edu.dce.nfc.cardemulator;


        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.EditText;
        import android.widget.TextView;

        import butterknife.InjectView;


public class MainActivity extends AppCompatActivity {



    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this, MyService.class);
        startService(i);

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

      //  Intent i = new Intent(this, MyService.class);
      //  startService(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        TextView textElement = (TextView)findViewById(R.id.textView1);
        textElement.append("registered CARD NUMBER:");
        TextView textElementcard = (TextView)findViewById(R.id.cardprint);


        String cardNumber = "1234";

        textElementcard.append(cardNumber);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

//        return super.onOptionsItemSelected(item);
//    }
}
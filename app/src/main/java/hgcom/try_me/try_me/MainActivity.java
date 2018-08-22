package hgcom.try_me.try_me;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button tryMe;
    private View mainView1;
    private int[] colors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colors=new int[]{Color.BLACK,Color.BLUE, Color.GREEN,Color.DKGRAY,Color.CYAN,Color.MAGENTA,Color.RED,Color.YELLOW};
        mainView1=findViewById(R.id.mainView);
        tryMe = (Button)findViewById(R.id.tryMeButtton);
        tryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int arLen=colors.length;
                Random ran=new Random();
                int randomNo=ran.nextInt(arLen);
               // mainView1.setBackgroundColor(randomNo);
                mainView1.setBackgroundColor(colors[randomNo]);
               // Log.d(TAG, "onClick: ");


            }
        });

    }
}

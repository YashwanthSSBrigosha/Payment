package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recJan,recFeb,recMar,recApr,recMay,recJun,recJul,recAug,recSep,recOct,recNov,recDec;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    ArrayList<Payment> paymentInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        buildRecyclerViewJan();
        buildRecyclerViewFeb();
        buildRecyclerViewMar();
        buildRecyclerViewApr();
        buildRecyclerViewMay();
        buildRecyclerViewJun();
        buildRecyclerViewJul();
        buildRecyclerViewAug();
        buildRecyclerViewSep();
        buildRecyclerViewOct();
        buildRecyclerViewNov();
        buildRecyclerViewDec();



        /*



        */


    }

    public void createCard(){
        paymentInfo = new ArrayList<Payment>();
        paymentInfo.add(new Payment("Donation","Rs.600","12/05/2021, 06:00 PM","REFUNDED"));
        paymentInfo.add(new Payment("Donation","Rs.600","12/05/2021, 06:00 PM","REFUNDED"));

    }

    public void buildRecyclerViewJan(){
        recJan = findViewById(R.id.recJan);
        recJan.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recJan.setLayoutManager(layoutManager);
        adapter = new PaymentAdapter(paymentInfo);
        recJan.setAdapter(adapter);
    }

   public void buildRecyclerViewFeb(){
       recFeb = findViewById(R.id.recFeb);
       recFeb.setHasFixedSize(true);
       recFeb.setLayoutManager(new LinearLayoutManager(this));
       recFeb.setAdapter(new PaymentAdapter(paymentInfo));
    }

    public void buildRecyclerViewMar(){
        recMar = findViewById(R.id.recMar);
        recMar.setHasFixedSize(true);
        recMar.setLayoutManager(new LinearLayoutManager(this));
        recMar.setAdapter(new PaymentAdapter(paymentInfo));
    }

    public void buildRecyclerViewApr(){
        recApr = findViewById(R.id.recApr);
        recApr.setHasFixedSize(true);
        recApr.setLayoutManager(new LinearLayoutManager(this));
        recApr.setAdapter(new PaymentAdapter(paymentInfo));

    }

    public void buildRecyclerViewMay(){
        recMay = findViewById(R.id.recMay);
        recMay.setHasFixedSize(true);
        recMay.setLayoutManager(new LinearLayoutManager(this));
        recMay.setAdapter(new PaymentAdapter(paymentInfo));


    }

    public void buildRecyclerViewJun(){
        recJun = findViewById(R.id.recJun);
        recJun.setHasFixedSize(true);
        recJun.setLayoutManager(new LinearLayoutManager(this));
        recJun.setAdapter(new PaymentAdapter(paymentInfo));


    }

    public void buildRecyclerViewJul(){
        recJul = findViewById(R.id.recJul);
        recJul.setHasFixedSize(true);
        recJul.setLayoutManager(new LinearLayoutManager(this));
        recJul.setAdapter(new PaymentAdapter(paymentInfo));

    }

    public void buildRecyclerViewAug(){
        recAug = findViewById(R.id.recAug);
        recAug.setHasFixedSize(true);
        recAug.setLayoutManager(new LinearLayoutManager(this));
        recAug.setAdapter(new PaymentAdapter(paymentInfo));


    }

    public void buildRecyclerViewSep(){
        recSep = findViewById(R.id.recSep);
        recSep.setHasFixedSize(true);
        recSep.setLayoutManager(new LinearLayoutManager(this));
        recSep.setAdapter(new PaymentAdapter(paymentInfo));

        ;
    }

    public void buildRecyclerViewOct(){
        recOct = findViewById(R.id.recOct);
        recOct.setHasFixedSize(true);
        recOct.setLayoutManager(new LinearLayoutManager(this));
        recOct.setAdapter(new PaymentAdapter(paymentInfo));


    }

    public void buildRecyclerViewNov(){
        recNov = findViewById(R.id.recNov);
        recNov.setHasFixedSize(true);
        recNov.setLayoutManager(new LinearLayoutManager(this));
        recNov.setAdapter(new PaymentAdapter(paymentInfo));


    }

    public void buildRecyclerViewDec(){
        recDec = findViewById(R.id.recDec);
        recDec.setHasFixedSize(true);
        recDec.setLayoutManager(new LinearLayoutManager(this));
        recDec.setAdapter(new PaymentAdapter(paymentInfo));
    }
}
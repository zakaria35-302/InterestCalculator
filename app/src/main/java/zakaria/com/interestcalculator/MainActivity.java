package zakaria.com.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    EditText principalAmountEt;
    EditText interestRateEt;
    EditText timePeriodEt;

    TextView interestAmountTv;
    TextView totalAmountTv;

    InterestCalculator interestCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        principalAmountEt=(EditText)findViewById(R.id.principalAmount);
        interestRateEt=(EditText)findViewById(R.id.interestRate);
        timePeriodEt=(EditText)findViewById(R.id.timePeriod);

        interestAmountTv=(TextView)findViewById(R.id.interestAmount);
        totalAmountTv=(EditText)findViewById(R.id.totalAmount);


    }


    public void btnInterestCalculate(View view){

        interestCalculator=new InterestCalculator();
        interestCalculator.setPrincipalAmount(Double.parseDouble(principalAmountEt.getText().toString()));
        interestCalculator.setInterestRate(Float.parseFloat(interestRateEt.getText().toString()));
        interestCalculator.setTimePeriod(Float.parseFloat(timePeriodEt.getText().toString()));

        double amountOfInterest=interestCalculator.totalInterestAmount();

        double totalAmount=interestCalculator.totalAmountWithInterest();


        interestAmountTv.setText((new DecimalFormat("##").format(amountOfInterest)));


        totalAmountTv.setText((new DecimalFormat("##").format(totalAmount)));




    }



}

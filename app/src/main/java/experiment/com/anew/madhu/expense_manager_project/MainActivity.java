package experiment.com.anew.madhu.expense_manager_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ExpensesImageButton, IncomesImageButton, BudgetImageButton, ReportImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpensesImageButton = (ImageButton) findViewById(R.id.ExpensesButton);
        IncomesImageButton = (ImageButton) findViewById(R.id.IncomesButton);
        BudgetImageButton = (ImageButton) findViewById(R.id.BudgetButton);
        ReportImageButton = (ImageButton) findViewById(R.id.ReportButton);

        ExpensesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadExpenseActivity = new Intent (MainActivity.this, expense_activity.class);
                startActivity(intentLoadExpenseActivity);
            }
        });

        IncomesImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadIncomeActivity = new Intent (MainActivity.this, income_activity.class);
                startActivity(intentLoadIncomeActivity);
            }
        });

        BudgetImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadBudgetActivity = new Intent (MainActivity.this, budget_activity.class);
                startActivity(intentLoadBudgetActivity);
            }
        });

        ReportImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadReportActivity = new Intent (MainActivity.this, report_activity.class);
                startActivity(intentLoadReportActivity);
            }
        });

    }
}

package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //создаём наш порт
        SeaPort port = new SeaPort("Новороссийск");

        //создаём наши способы дохода
        PortActivity rentOfPortSpace = new RentOfPortSpace("Аренда зданий магазинов", 170_000);
        PortActivity shipMaintenance = new ShipMaintenance("Обслуживание морских судов", 125, 3_500);

        //добавляем их в порт
        port.addActivites(new PortActivity[]{rentOfPortSpace, shipMaintenance});

        //выводим любым удобным способом
        String toOut = "Доход порта " + port.getName() + " в месяц: " + Math.round(port.getMonthlyIncome()) + " монет";
        System.out.println(toOut);

        TextView out = findViewById(R.id.out);
        out.setText(toOut);

        //можно ещё вот так делать

        //узнаём максимальную длину имени
        int maxLenghtName = 0;
        for (PortActivity activity : port.getActivities()) {
            maxLenghtName = activity.getName().length() > maxLenghtName ? activity.getName().length() : maxLenghtName;
        }
        maxLenghtName++;

        //выводим красивенько все заработки
        System.out.printf("|%-"+maxLenghtName+"s|%-7s|\n", "Активность", "Доход");
        for (PortActivity activity : port.getActivities()) {
            System.out.printf("|%-"+maxLenghtName+"s|%-7d|\n", activity.getName(),
                    activity instanceof ICapableOfEarning ?
                            Math.round(((ICapableOfEarning) activity).getMonthlyIncome()) : 0);
        }
    }
}
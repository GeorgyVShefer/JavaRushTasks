package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код

    @Override
    public void initialize() {
        setScreenSize(10,7);
        setCellColor(0,0,Color.RED);
        setCellColor(0,1,Color.ORANGE);
        setCellColor(0,2,Color.YELLOW);
        setCellColor(0,3,Color.GREEN);
        setCellColor(0,4,Color.BLUE);
        setCellColor(0,5,Color.INDIGO);
        setCellColor(0,6,Color.VIOLET);
    }
}

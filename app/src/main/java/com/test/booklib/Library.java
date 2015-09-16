package com.test.booklib;

import java.util.Random;

/**
 * Created by spm3 on 9/16/2015.
 */
public class Library {
    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.ic_mail;
            case 1:
                return R.drawable.ic_mail;
            case 2:
                return R.drawable.ic_mail;
            case 3:
                return R.drawable.ic_mail;
            case 4:
                return R.drawable.ic_mail;
        }
    }

    public static final String[] sCheeseStrings = {
            "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
            "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale"
    };

}

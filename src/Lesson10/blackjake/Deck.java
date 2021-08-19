package Lesson10.blackjake;

import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private Card[] cards = new Card[52];

    public Deck() {
        cards[0] = new Card(2, "Двойка треф");
        cards[1] = new Card(2, "Двойка бубны");
        cards[2] = new Card(2, "Двойка черви");
        cards[3] = new Card(2, "Двойка пика");

        cards[4] = new Card(3, "Тройка треф");
        cards[5] = new Card(3, "Тройка бубны");
        cards[6] = new Card(3, "Тройка черви");
        cards[7] = new Card(3, "Тройка пика");

        cards[8] = new Card(4, "Четверка треф");
        cards[9] = new Card(4, "Четверка бубны");
        cards[10] = new Card(4, "Четверка черви");
        cards[11] = new Card(4, "Четверка пика");

        cards[12] = new Card(5, "Пятерка треф");
        cards[13] = new Card(5, "Пятерка бубны");
        cards[14] = new Card(5, "Пятерка черви");
        cards[15] = new Card(5, "Пятерка пика");

        cards[16] = new Card(6, "Шестерка треф");
        cards[17] = new Card(6, "Шестерка бубны");
        cards[18] = new Card(6, "Шестерка черви");
        cards[19] = new Card(6, "Шестерка пика");

        cards[20] = new Card(7, "Семерка треф");
        cards[21] = new Card(7, "Семерка бубны");
        cards[22] = new Card(7, "Семерка черви");
        cards[23] = new Card(7, "Семерка пика");

        cards[24] = new Card(8, "Восьмерка треф");
        cards[25] = new Card(8, "Восьмерка бубны");
        cards[26] = new Card(8, "Восьмерка черви");
        cards[27] = new Card(8, "Восьмерка пика");

        cards[28] = new Card(9, "Девятка треф");
        cards[29] = new Card(9, "Девятка бубны");
        cards[30] = new Card(9, "Девятка черви");
        cards[31] = new Card(9, "Девятка пика");

        cards[32] = new Card(10, "Десятка треф");
        cards[33] = new Card(10, "Десятка бубны");
        cards[34] = new Card(10, "Десятка черви");
        cards[35] = new Card(10, "Десятка пика");

        cards[36] = new Card(2, "Валет треф");
        cards[37] = new Card(2, "Валет бубны");
        cards[38] = new Card(2, "Валет черви");
        cards[39] = new Card(2, "Валет пика");

        cards[40] = new Card(3, "Дама треф");
        cards[41] = new Card(3, "Дама бубны");
        cards[42] = new Card(3, "Дама черви");
        cards[43] = new Card(3, "Дама пика");

        cards[44] = new Card(4, "Король треф");
        cards[45] = new Card(4, "Король бубны");
        cards[46] = new Card(4, "Король черви");
        cards[47] = new Card(4, "Король пика");

        cards[48] = new Card(11, "Туз треф");
        cards[49] = new Card(11, "Туз бубны");
        cards[50] = new Card(11, "Туз черви");
        cards[51] = new Card(11, "Туз пика");

    }

        public Card getRandomCard(){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
            return cards[randomNum];
        }


}

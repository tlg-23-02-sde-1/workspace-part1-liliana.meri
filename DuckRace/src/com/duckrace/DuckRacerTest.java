package com.duckrace;
import static com.duckrace.Reward.*; // OK tp use * for static imports

class DuckRacerTest {

    public static void main(String[] args){

        DuckRacer racer5 = new DuckRacer(5, "Chris"); // (id, name)
        System.out.println(racer5);

        racer5.win(DEBIT_CARD);
        racer5.win(DEBIT_CARD);
        racer5.win(PRIZES);
        racer5.win(DEBIT_CARD);

        System.out.println(racer5);
    }
}
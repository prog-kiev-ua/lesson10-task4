package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class Letter {
    private List<String> letter = new ArrayList<>();

    public String printLine(int index){
        return letter.get(index);
    }

    public void setLetter(List<String> letter) {
        this.letter = letter;
    }
}

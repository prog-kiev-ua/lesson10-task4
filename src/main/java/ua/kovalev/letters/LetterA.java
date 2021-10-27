package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class LetterA extends Letter {
    public LetterA() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔═══╗");
        l.add("║╔═╗║");
        l.add("║║─║║");
        l.add("║╚═╝║");
        l.add("║╔═╗║");
        l.add("╚╝─╚╝");
        setLetter(l);
    }
}

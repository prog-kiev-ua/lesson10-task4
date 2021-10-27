package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class LetterO extends Letter{
    public LetterO() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔═══╗");
        l.add("║╔═╗║");
        l.add("║║─║║");
        l.add("║║─║║");
        l.add("║╚═╝║");
        l.add("╚═══╝");
        setLetter(l);
    }
}

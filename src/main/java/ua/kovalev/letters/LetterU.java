package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class LetterU extends Letter{
    public LetterU() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔╗─╔╗");
        l.add("║║─║║");
        l.add("║║─║║");
        l.add("║║─║║");
        l.add("║╚═╝║");
        l.add("╚═══╝");
        setLetter(l);
    }
}

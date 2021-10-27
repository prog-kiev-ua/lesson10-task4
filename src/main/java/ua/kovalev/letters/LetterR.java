package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class LetterR extends Letter{
    public LetterR() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔═══╗");
        l.add("║╔═╗║");
        l.add("║╚═╝║");
        l.add("║╔╗╔╝");
        l.add("║║║╚╗");
        l.add("╚╝╚═╝");
        setLetter(l);
    }
}

package ua.kovalev.letters;

import java.util.ArrayList;
import java.util.List;

public class LetterY extends Letter{
    public LetterY() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔╗──╔╗");
        l.add("║╚╗╔╝║");
        l.add("╚╗╚╝╔╝");
        l.add("─╚╗╔╝─");
        l.add("──║║──");
        l.add("──╚╝──");
        setLetter(l);
    }
}

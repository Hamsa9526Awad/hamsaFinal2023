package awd.example.hamsafinal2023.Data.engLetters;
import androidx.room.Entity;

@Entity//Entity==Table==جدول

public class Letter {
    public char letter;
    public char BrailLetter;

    public void setBrailLetter(char letter) {
        if (letter=='a' )
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='b')
        {
            BrailLetter=LettersUtil.b;
        }
        if (letter=='c')
        {
            BrailLetter=LettersUtil.c;
        }
        if (letter=='d')
        {
            BrailLetter=LettersUtil.d;
        }
        if (letter=='e')
        {
            BrailLetter=LettersUtil.e;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
        if (letter=='a')
        {
            BrailLetter=LettersUtil.a;
        }
    }
}

package Ratiocinator.Calculus.RatiocinatorCalculus;

public class Mensonge extends Affirmation{
    public Mensonge(String texte) {
        super(texte);
    }

    @Override
    public boolean verité() {
        return false;
    }
}

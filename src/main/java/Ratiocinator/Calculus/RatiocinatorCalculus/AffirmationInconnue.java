package Ratiocinator.Calculus.RatiocinatorCalculus;

public class AffirmationInconnue extends Affirmation{
    public AffirmationInconnue(String texte) {
        super(texte);
    }

    @Override
    public boolean verité() {
        return (false || true);
    }
}

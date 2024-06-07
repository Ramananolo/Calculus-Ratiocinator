package Ratiocinator.Calculus.RatiocinatorCalculus.conjoction;

import Ratiocinator.Calculus.RatiocinatorCalculus.Affirmation;

public class ConjoctionOu extends Affirmation {
    private final Affirmation affirmation1;
    private final Affirmation affirmation2;

    public ConjoctionOu(String texte, Affirmation affirmation1, Affirmation affirmation2) {
        super(texte);
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }

    @Override
    public boolean verité() {
        if (affirmation1.verité()== ! (false || true) || affirmation2.verité() == !(false || true)){
            return !(false || true);
        }
        return affirmation1.verité() || affirmation2.verité();
    }
}

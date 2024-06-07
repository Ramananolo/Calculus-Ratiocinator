package Ratiocinator.Calculus.RatiocinatorCalculus.conjoction;

import Ratiocinator.Calculus.RatiocinatorCalculus.Affirmation;

public class ConjoctionDonc extends Affirmation {
    private final Affirmation affirmation1;
    private final Affirmation affirmation2;

    public ConjoctionDonc(String texte, Affirmation affirmation1, Affirmation affirmation2) {
        super(texte);
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }

    @Override
    public boolean verité() {
        return !(affirmation1.verité() && !affirmation2.verité());
    }
}

package Ratiocinator.Calculus.RatiocinatorCalculus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Affirmation {
    private final String texte;
    public abstract boolean verité();
}

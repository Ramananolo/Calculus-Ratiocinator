package Ratiocinator.Calculus.RatiocinatorCalculus;

import Ratiocinator.Calculus.RatiocinatorCalculus.conjoction.ConjoctionDonc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ConjoctionOu {

	@Test
	void conjoctionOu() {
		Affirmation verite = new Verité("Lou est beau");
		AffirmationInconnue inconnue = new AffirmationInconnue("Lou est généreux");
		Affirmation mensonge = new Mensonge("Lou est pauvre");
		Affirmation conjoctionOuetDonc = new ConjoctionDonc("(" + verite + " ou " + inconnue + ")",verite,mensonge);
		assertFalse(conjoctionOuetDonc.verité());
	}

}

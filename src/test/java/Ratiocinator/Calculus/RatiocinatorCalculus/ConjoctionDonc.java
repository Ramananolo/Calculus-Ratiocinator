package Ratiocinator.Calculus.RatiocinatorCalculus;

import Ratiocinator.Calculus.RatiocinatorCalculus.conjoction.ConjoctionDonc;
import Ratiocinator.Calculus.RatiocinatorCalculus.conjoction.ConjoctionOu;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class conjoctionDonc {

	@Test
	void contextLoads() {
		Affirmation verite = new Verité("Lou est beau");
		AffirmationInconnue inconnue = new AffirmationInconnue("Lou est généreux");
		Affirmation mensonge = new Mensonge("Lou est pauvre");
		Affirmation conjocton = new ConjoctionDonc("(" + verite + " Donc " + mensonge + ")", verite, mensonge);
		assertFalse(conjocton.verité());
	}

}

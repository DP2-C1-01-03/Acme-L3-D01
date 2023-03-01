
package acme.entities;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	protected Integer			totalNumberOfPrincipalLecturer;
	protected Integer			totalNumberOfPrincipalStudent;
	protected Integer			totalNumberOfPrincipalAssistant;
	protected Integer			totalNumberOfPrincipalCompany;
	protected Integer			totalNumberOfPrincipalAuditor;

	protected Double			ratioOfPeepsWithEmailAndLink;

	protected Double			ratioOfCriticalBulletins;
	protected Double			rationOfNonCriticalBulletins;

	protected List<Double>		averageBudgetOffersByCurrency;
	protected List<Double>		minimumBudgetOffersByCurrency;
	protected List<Double>		maximumBudgetOffersByCurrency;
	protected List<Double>		deviationBudgetOffersByCurrency;

	protected Double			averageNumberOfNotesPostedTheLast10Weeks;
	protected Double			minimumNumberOfNotesPostedTheLast10Weeks;
	protected Double			maximumNumberOfNotesPostedTheLast10Weeks;
	protected Double			deviationNumberOfNotesPostedTheLast10Weeks;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}

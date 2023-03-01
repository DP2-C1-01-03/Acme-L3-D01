
package acme.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Configuration extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------
	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------
	@NotBlank
	protected String			currency;

	@NotBlank
	protected String			acceptedCurrencies;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}

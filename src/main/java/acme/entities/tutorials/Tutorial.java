
package acme.entities.tutorials;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Tutorial extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}[0-9]{3}", message = "{validation.tutorial.code}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractText;

	@NotBlank
	@Length(max = 100)
	protected String			goals;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date				estimatedStart;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date				estimatedEnd;

	// Derived attributes -----------------------------------------------------


	public Duration estimatedDuration(final Date estimatedStart, final Date estimatedEnd) {
		final Duration res = MomentHelper.computeDuration(estimatedStart, estimatedEnd);
		return res;
	}

	// Relationships ----------------------------------------------------------

}

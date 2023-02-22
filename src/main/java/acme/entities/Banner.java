
package acme.entities;

import java.time.Duration;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.time.DurationMin;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends AbstractEntity {
	
	// Serialisation identifier -----------------------------------------------

	protected static final long serialVersionUID = 1L;

	// Attributes -------------------------------------------------------------

	@CreationTimestamp
	@Past
	protected LocalDateTime creationDateTime;
	
	@UpdateTimestamp
	@Past
	protected LocalDateTime updateDateTime;
	
	@DurationMin(days=7)
	protected Duration displayPeriod;

	@NotBlank
	protected String sector;

	@URL
	@NotNull
	protected String pictureUrl;
	
	@Length(max=76)
	@NotNull
	protected String slogan;
	
	// Derived attributes -----------------------------------------------------
	
	public LocalDateTime getDisplayEndDateTime() {
		return (LocalDateTime) displayPeriod.addTo(updateDateTime);
	}

	// Relationships ----------------------------------------------------------
}


package acme.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

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

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	protected Date creationDateTime;

	@Temporal(TemporalType.TIMESTAMP)	
	@PastOrPresent
	protected Date updateDateTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Future
	protected Date displayEndDateTime;

	@URL
	@NotNull
	protected String pictureUrl;
	
	@Length(max=75)
	@NotNull
	protected String slogan;
	
	@URL
	@NotNull
	protected String webDocument;
	
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}

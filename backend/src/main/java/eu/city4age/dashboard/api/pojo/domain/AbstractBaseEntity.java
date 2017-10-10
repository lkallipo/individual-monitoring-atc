package eu.city4age.dashboard.api.pojo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import eu.city4age.dashboard.api.pojo.json.view.View;

/**
 * Superclass for domain model.
 *
 * @author Milos Holclajtner (milos.holclajtner at belit.co.rs)
 */
@MappedSuperclass
<<<<<<< HEAD
public abstract class AbstractBaseEntity<T> implements Serializable {
=======
public abstract class AbstractBaseEntity implements Serializable {
>>>>>>> c4a-atc/master

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

<<<<<<< HEAD
	@JsonView(View.BaseView.class)
	@Id
	@Generated(GenerationTime.INSERT)
	@Column(name = "id", columnDefinition = "serial", insertable = true, updatable = true, unique = true)
	protected T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
=======
	@JsonView(View.AssessmentView.class)
	@Id
	@Generated(GenerationTime.INSERT)
	@Column(name = "id", insertable = true, updatable = true, unique = true, nullable = false)
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
>>>>>>> c4a-atc/master
		this.id = id;
	}

	@JsonIgnore
	public boolean isWithoutId() {
		return (this.id == null || this.id.equals(0L));
	}

}

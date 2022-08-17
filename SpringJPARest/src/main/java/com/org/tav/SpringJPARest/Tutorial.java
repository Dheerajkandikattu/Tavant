package com.org.tav.SpringJPARest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tutorials")
public class Tutorial {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String title;
private String description;
private boolean published;

public Tutorial()
{
	super();
}
public Tutorial(String title, String description, boolean published) {
	super();
	this.title = title;
	this.description = description;
	this.published = published;
}

public int getId() {
	return id;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean isPublished() {
	return published;
}
public void setPublished(boolean published) {
	this.published = published;
}
@Override
public String toString() {
	return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", published=" + published
			+ "]";
}


}
